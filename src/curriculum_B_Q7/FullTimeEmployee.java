package curriculum_B_Q7;

// 正社員の計算ロジックだけを持つ具象クラス
// 新しい社員タイプは新クラス追加で拡張

public class FullTimeEmployee extends Employee implements Payable {
	private static final int RATE = 1200;

	public FullTimeEmployee(String name) {
		super(name);
	}

	@Override
	public int costForHours(int hours) {
		return RATE * hours;
	}

	@Override
	public String toString() {
		return "【正社員】" + name;
	}
}
