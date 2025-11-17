package curriculum_C;

import java.util.Scanner;

public class Question6 {
// プレイヤーのクラス

	private int hand;
	private Scanner scanner;

	public Question6(Scanner scanner) {
		this.scanner = scanner;
	}

	public void inputHand() {
		// 手の入力を受ける
		while (true) {
			System.out.print("グー(0),チョキ(1),パー(2)を入力:");
			String line = scanner.nextLine();

			try {
				int value = Integer.parseInt(line);
				if (value >= 0 && value <= 2) {
					this.hand = value;
					break;
				} else {
					System.out.println("0〜2の数字を入力してください。");
				}
			} catch (NumberFormatException e) {
				System.out.println("数字で入力してください。");
			}
		}
	}

	public int getHand() {
		return hand;
	}

	public String handToString() {
		switch (hand) {
		case 0:
			return "グー";
		case 1:
			return "チョキ";
		case 2:
			return "パー";
		default:
			return "不明";
		}
	}
}