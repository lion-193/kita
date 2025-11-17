package curriculum_B_Q7;

// 契約社員の計算ロジックだけを持つ具象クラス（O, L）

public class ContractEmployee extends Employee {

	private static final int RATE = 1000;
	// 契約社員の時給

	public ContractEmployee(String name) {
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
