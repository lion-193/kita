package curriculum_D;

import java.io.IOException;
import java.util.Random;

// バトル中の攻撃処理をまとめたクラス
public class BattleLogFile {

	private Random rand = new Random(); // 先攻ランダム判定用

	// SP が同じだったときに true/false で先攻を決める
	public boolean decideFirst() {
		return rand.nextBoolean();
	}

	// 攻撃処理
	// attacker：攻撃するキャラ
	// defender：攻撃されるキャラ
	// logger：LogHelper（画面＋ファイル出力）
	public void attack(Character attacker, Character defender, LogHelper logger) throws IOException {

		// ダメージ（ATそのまま）
		int damage = attacker.getAt();

		// 防御側のHPを減らす
		defender.setHP(defender.getHp() - damage);

		// 攻撃ログ（画面＋ファイル）
		logger.log(attacker.getName() + " の攻撃！ " + defender.getName() + " に " + damage + " のダメージ！");

		// 残りHPログ（画面＋ファイル）
		logger.log(defender.getName() + " の残りHP：" + defender.getHp());
	}
}
