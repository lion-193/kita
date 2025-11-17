package curriculum_B_Q7;

// 社員共通のデータのみを持つ抽象基底
// 給与計算（Payable）は抽象メソッドとして下位型に委譲
// 下位型は置換可能

public abstract class Employee7 implements HasName, Payable {

	protected final String name;

	protected Employee7(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	// 各社員タイプが時給計算を実装する（抽象メソッド）
	@Override
	public abstract int costForHours(int hours);

	// ラベルは各具象クラスで上書き（toString）
	@Override
	public String toString() {
		return name;
	}
}
