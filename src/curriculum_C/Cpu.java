package curriculum_C;

import java.util.Random;

public class Cpu {

	private Random random = new Random();

	public int generateHand() {
		return random.nextInt(3);
	}

	public static String handToString(int hand) {
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