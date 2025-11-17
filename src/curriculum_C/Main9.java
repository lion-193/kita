package curriculum_C;

import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Question6 player = new Question6(scanner);
		Cpu cpu = new Cpu();

		while (true) {

			player.inputHand();
			int playerHand = player.getHand();
			// プレイヤーの手の入力

			int cpuHand = cpu.generateHand();
			// CPUの手をランダムで決定

			System.out.println("あなたの手：" + player.handToString());
			System.out.println("CPUの手：" + Cpu.handToString(cpuHand));

			int result = judge(playerHand, cpuHand);

			if (result == 1) {
				System.out.println("あなたの勝ち！");
				break;
			} else if (result == 0) {
				System.out.println("あいこです。もう一度！");
			} else {
				System.out.println("あなたの負けです。もう一度！");
			}
		}
		scanner.close();
	}

	// 勝敗判定
	private static int judge(int player, int cpu) {
		if (player == cpu)
			return 0;

		if ((player == 0 && cpu == 1) || (player == 1 && cpu == 2) || (player == 2 && cpu == 0)) {
			return 1;
		}
		return -1;
	}
} 