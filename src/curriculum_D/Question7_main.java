package curriculum_D;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

// 課題7のメイン処理
public class Question7_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // キーボード入力
		Random rand = new Random(); // プレイヤーステータス用
		BattleLogFile blog = new BattleLogFile(); // 攻撃処理クラス

		// battle_log.txt を上書きモードで作成（false）
		try (FileWriter writer = new FileWriter("battle_log.txt", false)) {

			LogHelper logger = new LogHelper(writer);
			// LogHelper を作り、writer を渡す（これで両方出力できる）

			// バトルログ開始
			logger.log("=== Player vs Daemon バトルログ ===");

			// プレイヤー名入力（画面だけ print）
			System.out.print("プレイヤー名を入力してください：");

			String playerName = sc.nextLine();
			logger.log("プレイヤー名：" + playerName);

			// プレイヤーステータス生成
			Character player = new Character(playerName, 60 + rand.nextInt(41), // HP : 60～100
					10 + rand.nextInt(11), // AT : 10～20
					5 + rand.nextInt(6) // SP : 5～10
			);
			logger.log("プレイヤー：" + player.getStatus());

			// デーモン読み込み
			Character daemon = null;
			try {
				daemon = Daemon_status.loadDaemon("daemon_status.txt");
			} catch (IOException e) {
				logger.log("デーモン読み込み失敗");
				sc.close();
				return;
			}
			logger.log("デーモン：" + daemon.getStatus());
			logger.log("");

			logger.log("=== バトル開始！ ===");

			// --- 先攻決め ---
			Character attacker;
			Character defender;

			if (player.getSp() > daemon.getSp()) {
				attacker = player;
				defender = daemon;
			} else if (player.getSp() < daemon.getSp()) {
				attacker = daemon;
				defender = player;
			} else {
				boolean playerFirst = blog.decideFirst();
				attacker = playerFirst ? player : daemon;
				defender = playerFirst ? daemon : player;
			}

			logger.log("先攻：" + attacker.getName());
			logger.log("");

			// --- ターンバトル開始 ---
			while (player.isAlive() && daemon.isAlive()) {

				// 攻撃（画面＋ファイル）
				blog.attack(attacker, defender, logger);

				if (!defender.isAlive())
					break;

				// 現在ステータス
				logger.log("現在のステータス：");
				logger.log("プレイヤー：" + player.getStatus());
				logger.log("デーモン　：" + daemon.getStatus());
				logger.log("");

				// 攻撃者交代
				Character temp = attacker;
				attacker = defender;
				defender = temp;
			}

			// 勝者
			String winner = player.isAlive() ? player.getName() : daemon.getName();

			logger.log("勝者：" + winner);
			logger.log("=== バトル終了 ===");

		} catch (IOException e) {
			System.out.println("バトルログの書き込みに失敗しました。");
		}

		sc.close(); // Scanner を閉じる
	}
}
