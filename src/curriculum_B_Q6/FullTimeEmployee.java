package curriculum_B_Q6;

// 正社員クラス

public class FullTimeEmployee extends Employee {
	// Employee2（抽象クラス）を継承して、共通のデータやルールを引き継ぐ
	private static final int BASE_RATE = 1250;
	// 1時間あたりの基本給を定数で設定（1250円）
	// finalを付けることで変更できなくなる（定数）

	public FullTimeEmployee(String id, String name) {
		super(id, name);
		// 親クラスのコンストラクタを呼び出し
		// Employee側でidとnameを初期化
	}

	@Override
	public int costForDay(int hoursWorked) {
		// インターフェイスで定義された抽象メソッドを実装
		// hoursWorkedはその日働いた時間

		if (hoursWorked <= 8) {
			// 8時間以内なら通常計算
			return BASE_RATE * hoursWorked;
		} else {
			// 8時間を超えた場合は残業分を1.25倍にする
			int base = BASE_RATE * 8;
			// 通常８時間
			int overtimeRate = (int) (BASE_RATE * 1.25);
			// 残業時間を計算
			int overtimeHours = hoursWorked - 8;
			// 残業時間を計算
			return base + overtimeRate * overtimeHours;
			// 合計を返す
		}
	}

	@Override
	public String toString() {
		// 表示内容をカスタマイズ
		return "【正社員】";
	}
}