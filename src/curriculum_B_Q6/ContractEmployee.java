package curriculum_B_Q6;

// 契約社員クラス

public class ContractEmployee extends Employee {
	// 抽象クラスを継承して、共通のデータ構造を引き継ぐ
	// ここではcostForDay()の中身だけ契約社員用に実装する

	private static final int HOURLY_RATE = 1000;
	// １時間あたりの時給を定数として定義（1000円）
	// finalをつけることであとから変更されない固定値にする

	public ContractEmployee(String id, String name) {
		super(id, name);
		// 親クラスのコンストラクタを呼び出して
		// idとnameを初期化する
	}

	@Override
	public int costForDay(int hoursWorked) {
		// インターフェイスで決めた「日給を計算する」メソッドを実装。
		// 契約社員の場合は、時間 × 時給のシンプルな計算。
		return HOURLY_RATE * hoursWorked;
	}

	@Override
	public String toString() {
		return "【契約社員】";
	}

}