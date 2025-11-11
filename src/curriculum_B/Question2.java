package curriculum_B;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) { // メインメソッド開始

		int score = 75; // score に 75 を代入 
		if (score >= 60) { // 60点以上か判定
			System.out.println("合格です！"); // 条件が真なら表示
		}

		int age = 25; // age に 25 を代入
		if (age >= 20 && age <= 30) { // 20〜30歳の範囲か
			System.out.println("適正年齢です"); // 条件が真なら表示
		} else { // それ以外
			System.out.println("対象外です"); // 表示
		}

		int age2 = 18; // age2 に 18 を代入
		if (age2 >= 20) { // 20歳以上か
			System.out.println("成人です"); // 成人の場合
		} else if (age2 >= 13 && age2 <= 19) { // 13〜19歳か
			System.out.println("ティーンエイジャーです"); // ティーンの場合
		} else if (age2 <= 12) { // 12歳以下か
			System.out.println("子供です"); // 子供の場合
		}

		int x = 30; // x に 30
		int y = 15; // y に 15
		int z = 50; // z に 50
		if (x >= y && x >= z) { // x が最大か
			System.out.println(x); // x を表示
		} else if (y >= x && y >= z) { // y が最大か
			System.out.println(y); // y を表示
		} else { // それ以外 → z が最大
			System.out.println(z); // z を表示
		}

		int num = 2; // num に 2
		if (num > 0) { // 正の数か
			System.out.println("正の数です"); // 表示
		} else if (num == 0) { // 0 か
			System.out.println("0です"); // 表示
		} else { // 負の数
			System.out.println("負の数です"); // 表示
		}

		int value = 7; // value に 7
		if (value % 2 == 0) { // 偶数か
			System.out.println("偶数です"); // 表示
		} else { // 奇数の場合
			System.out.println("奇数です"); // 表示
		}

		int score1 = 75; // score1 に 75
		if (score1 >= 90) { // 90点以上
			System.out.println("優"); // 表示
		} else if (score1 >= 70) { // 70点以上
			System.out.println("良"); // 表示
		} else if (score1 >= 50) { // 50点以上
			System.out.println("可"); // 表示
		} else { // それ以外
			System.out.println("不可"); // 表示
		}

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine(); // input に空文字を代入
		if (input == null || input.trim().isEmpty()) { // null または空文字か判定
			System.out.println("入力が無効です"); // 表示
		} else { // 有効な文字列の場合
			System.out.println("入力された値：" + input); // input を表示
		}

		System.out.print("1〜12 の月を入力してください：");
		int month = scanner.nextInt(); // ← コンソール入力（1〜12）

		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("冬");
			break;

		case 3:
		case 4:
		case 5:
			System.out.println("春");
			break;

		case 6:
		case 7:
		case 8:
			System.out.println("夏");
			break;

		case 9:
		case 10:
		case 11:
			System.out.println("秋");
			break;

		default:
			System.out.println("無効な月です");
			break;

		}
		scanner.close();
		// TODO Auto-generated method stub
	}
}
