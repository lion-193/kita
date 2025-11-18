package curriculum_D;

import java.io.FileWriter;
import java.io.IOException;

// コンソール（画面）とファイルの両方にログを出力するクラス
public class LogHelper {

	private FileWriter writer; // battle_log.txt に書くための FileWriter

	// コンストラクタで writer を受け取って保持する
	public LogHelper(FileWriter writer) {
		this.writer = writer;
	}

	// ログ出力メソッド
	// message → 画面とファイルに同じ内容を出す
	public void log(String message) throws IOException {

		System.out.println(message); // 画面（コンソール）出力
		writer.write(message + System.lineSeparator()); // ファイル出力（改行付き）
	}
}
