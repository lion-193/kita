package curriculum_D;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// デーモンのステータスをファイルから読み込むクラス
public class Daemon_status {

	// daemon_status.txt からステータスを読み込み、
	// Character オブジェクトとして返すメソッド
	public static Character loadDaemon(String fileName) throws IOException {

		// ファイルを1行ずつ読む準備
		BufferedReader br = new BufferedReader(new FileReader(fileName));

		// 1行目：名前
		String name = br.readLine();
		// 2行目：HP
		int hp = Integer.parseInt(br.readLine());
		// 3行目：AT
		int at = Integer.parseInt(br.readLine());
		// 4行目：SP
		int sp = Integer.parseInt(br.readLine());

		br.close(); // ファイルを閉じる

		// 読み込んだ内容で Character を作って返す
		return new Character(name, hp, at, sp);
	}
}
