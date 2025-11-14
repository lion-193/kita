package curriculum_Bobjkt;

// 契約社員の計算ロジックだけを持つ具象クラス（O, L）

public class ContractEmployee3 extends Employee7 {

	private static final int RATE = 1000;
	// 契約社員の時給

	public ContractEmployee3(String name) {
		super(name);
	}

	@Override
	public int costForHours(int hours) {
		return RATE * hours;
	}

	@Override
	public String toString() {
		return "【契約社員】" + name;
	}
}
