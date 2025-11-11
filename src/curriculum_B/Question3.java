package curriculum_B;

import java.util.Scanner;
import java.util.Random;

public class Question3 {
	public static void main(String[] args) {

		// Q1
		for (int i = 1; i <= 10; i++) { // iが1〜10の間、1ずつ増える
			System.out.println(i);
		}
		// 1、2、3、4、5、6、7、8、9、10

		// Q2
		for (int i = 2; i <= 20; i += 2) { // 2から始めて2ずつ増やす
			System.out.println(i);
		}
		// 2、4、6、8、10、12、14、16、18、20 

		// Q3
		for (int i = 10; i >= 1; i--) { // 10から1まで1ずつ減る
			System.out.println(i);
		}
		//

		// Q4
		int sumFor = 0; // 合計値を入れる変数
		for (int i = 1; i <= 100; i++) { // 1〜100
			sumFor += i; // i を足していく
		}
		System.out.println("合計(for)：" + sumFor);

		// Q5
		for (int i = 1; i <= 5; i++) { // 行数（1〜5）
			for (int j = 1; j <= i; j++) { // 各行の*の数
				System.out.print("*"); // 改行しない
			}
			System.out.println(); // 行の終わりで改行
		}

		// Q6
		int w1 = 1; // 開始値
		while (w1 <= 10) { // w1が10以下の間続く
			System.out.println(w1);
			w1++; // w1を1ずつ増やす
		}

		// Q7
		int w2 = 2;
		while (w2 <= 20) { // 20以下の間続く
			System.out.println(w2);
			w2 += 2; // 偶数になるよう2ずつ増やす
		}

		// Q8
		int w3 = 10;
		while (w3 >= 1) { // 1以上の間続く
			System.out.println(w3);
			w3--; // 1ずつ減らす
		}

		// Q9
		int w4 = 1;
		int sumWhile = 0; // 合計を入れる変数
		while (w4 <= 100) {
			sumWhile += w4; // 足し算
			w4++; // 増やす
		}
		System.out.println("合計(while)：" + sumWhile);

//	      // Q10
//	        Scanner sc = new Scanner(System.in); 
//	        System.out.println("数値を入力してください。");
//	        
//	        while (true) { 
//	            int num_Q10 = sc.nextInt(); 
//	            if (num_Q10 == 0) { 
//	                System.out.println("0が入力されたので終了しました。");
//	                break; 
//	            }
//	            System.out.println("あなたが入力した数字は" + num_Q10 + "です。０が入力されるまで繰り返します"); 
//	        }
//	        
//
//	        
//	       
//	        for (int i = 1; i <= 11; i++) { // 1〜11
//	            System.out.println("Q" + i); // 例：Q1、Q2…
//	        }
//          
//	        
		// Q11
		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				int result = a * b;
				System.out.printf("%02d * %02d = %2d", a, b, result);
				if (b < 9) {
					System.out.print("||");
				}
			}
			System.out.println();
		}

		// Q12
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		// 0〜12の在庫数をランダムに設定（13を渡すと0〜12になる）
		int stockTv = random.nextInt(13);
		int stockDisplay = 1; // ディスプレイは1台だけとする
		int stockPc = random.nextInt(13);
		int stockAc = random.nextInt(13);
		int stockFridge = random.nextInt(13);
		int stockWashing = random.nextInt(13);
		int stockVapor = random.nextInt(13);

		System.out.println("在庫を確認したい商品名を、読点(、)またはカンマ(,)で区切って入力してください。");
		System.out.println("例）テレビ、パソコン, 冷蔵庫");

		// 入力を1行受け取って正規化
		String line = scanner.nextLine();
		// いろいろな区切り記号をカンマに統一し、前後空白を除去
		line = line.replace('、', ',').replace('，', ',').trim();

		// 何も入っていなければ終了
		if (line.isEmpty()) {
			System.out.println("商品名が入力されていません。終了します。");
			return;
		}

		// 分割して1つずつ判定
		String[] requestedItems = line.split("\\s*,\\s*"); // カンマの前後の空白を無視

		for (String itemInput : requestedItems) {
			switch (itemInput) {
			case "パソコン":
				System.out.println("パソコンの残り台数は " + stockPc + " 台です。");
				break;
			case "エアコン":
				System.out.println("エアコンの残り台数は " + stockAc + " 台です。");
				break;
			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は " + stockFridge + " 台です。");
				break;
			case "洗濯機":
				System.out.println("洗濯機の残り台数は " + stockWashing + " 台です。");
				break;
			case "テレビ":
				System.out.println("テレビの残り台数は " + stockTv + " 台です。");
				System.out.println("ディスプレイの在庫は " + stockDisplay + " 台です。");
				break;
			case "ディスプレイ":
				System.out.println("ディスプレイの在庫は " + stockDisplay + " 台です。");
				break;
			case "加湿器":
				System.out.println("加湿器の残り台数は " + stockVapor + " 台です。");
				break;
			default:
				System.out.println("「" + itemInput + "」は存在しません。");
				break;
			}
		}

		// パソコンの残り台数は 8 台です。
		// エアコンの残り台数は 0 台です。
		// 冷蔵庫の残り台数は 4 台です。
		// 洗濯機の残り台数は 6 台です。
		// テレビの残り台数は 5 台です。
		// ディスプレイの在庫は 1 台です。
		// 加湿器の残り台数は 1 台です。
		// 「その他」は存在しません。

		scanner.close();
	}
}
