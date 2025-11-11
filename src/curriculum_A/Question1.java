package curriculum_A;

public class Question1 {

	public static void main(String[] args) {
		byte byteNum = 0;
		// 変数byteNumの初期値を代入 
		byteNum = 10;
		// 変数 byteNum に 10 を代入

		short shortNum = 0;
		// 変数shortNumの初期値を代入
		shortNum = 100;
		// 変数 shortNum に 100 を代入

		int intNum = 0;
		// 変数intNumの初期値を代入
		intNum = 1000;
		// 変数 intNum に 1000 を代入

		long longNum = 0L;
		// 変数longNumの初期値を代入
		longNum = 10000L;
		// 変数 longNum に 10000 を代入

		float floatNum = 0.0f;
		// 変数floatNumの初期値を代入
		floatNum = 9.5f;
		// 変数 floatNum に 9.5f を代入

		double doubleNum = 0.0;
		// 変数doubleNumの初期値を代入
		doubleNum = 10.5;
		// 変数 doubleNum に 10.5 を代入

		char lette = '\u0000';
		// 変数letterの初期値を代入
		lette = 'a';
		// 変数 letter に "a" を代入

		String letters = null;
		// 変数lettersの初期値を代入
		letters = "ハロー";
		// 変数 letters に "ハロー" を代入

		boolean isBoolean = false;
		// 変数isBooleanの初期値を代入
		isBoolean = true;
		// 変数 isBoolean に true を代入

		// TODO Auto-generated method stub

		System.out.println(byteNum + shortNum + intNum + longNum);
		// 11110 変数を用いて左記を出力
		System.out.println(floatNum + doubleNum);
		// 20 変数を用いて左記を出力
		System.out.println(lette + letters + isBoolean);
		// a ハロー true 変数を用いて左記を出力(間に半角スペース入れる)
		System.out.println(byteNum + byteNum + byteNum + shortNum + intNum + longNum);
		// 11130 数字を全て足して左記を出力
		System.out.println(byteNum * shortNum * intNum * longNum);
		// 10000000000 小数点以外の数字を全てかけて左記を出力
		System.out.println(doubleNum / shortNum);
		// 0.105 10.5 割る100をして左記を出力
		System.out.println(byteNum - shortNum);
		// -90 10 引く100をして左記を出力

		String name = "山田太郎";
		// nameというString型の変数を宣言
		// 上記変数に山田太郎という値の代入
		System.out.println("こんにちは、" + name + "さん！");
		// こんにちは、山田太郎さん！
		// name変数を使用してコンソールにこんにちは、山田太郎さん!と出力

		int age = 25;
		// age という int型の変数を宣言
		// 上記変数に25 を代入
		System.out.println("年齢：" + age + "歳");
		// 年齢：25歳
		// age変数を使用しコンソールに年齢:25歳を出力

		int num1 = 10;
		// num1というint型の変数を宣言し、10を代入
		int num2 = 5;
		// num2というint型の変数を宣言し、5を代入
		int sum = num1 + num2;
		// num1とnum2 を足す
		System.out.println(sum);
		// 15
		// 結果をsumという変数に代入し、コンソールに出力

		int score = 80;
		// scoreというint型の変数を宣言し、80を代入
		score = score + 20;
		// scoreに20を加えて、更新
		System.out.println("最終スコア:" + score);
		// 最終スコア:100
		// 最終スコア:100をscoreを使用してコンソールに出力

		double price = 99.99;
		// priceというdouble型の変数を宣言し、99.99を代入
		int intPrice = (int) price;
		// priceをint型に変換
		System.out.println("整数価値：" + intPrice);
		// 整数価値：99
		// 整数価格:99とコンソールに出力

		String numStr = "123";
		// String型の変数numStrに"123"を代入
		int num = Integer.parseInt(numStr);
		// numStrをint型に変換
		System.out.println("変換後の値：" + (num + 10));
		// 変換後の値：133
		// 変換後の値:の後ろにnumStr+10した結果をコンソールに出力

		int num3 = 50;
		// int型の変数num3に50を代入
		String strNum = String.valueOf(num3);
		// num3をString型に変換
		System.out.println("得点:" + strNum + "点");
		// 得点:123点
		// 得点:50点の形で出力

		int a = 10;
		// int型の変数aに10を代入
		int b = 20;
		// int型の変数bに20を代入
		boolean result = (a > b) ? true : false;
		// aがbより小さいかどうかをboolean変数resultに代入
		System.out.println(result);
		// false
		// resultの値を出力

		int x = 15;
		// int型の変数xに15を代入
		String result1 = (x >= 10) ? "OK" : "NG";
		// xが10以上なら"OK"、そうでなければ"NG"になるよう代入
		System.out.println(result1);
		// OK
		// 出力

		String text = "私はjavaが好きです。javaは楽しい！";
		// Stringtextに"私はJavaが好きです。Javaは楽しい!を代入
		String result2 = text.replace("java", "python");
		// JavaをPythonに置き換え
		System.out.println(result2);
		// 私はpythonが好きです。pythonは楽しい！
		// 出力

	}

}

//test
