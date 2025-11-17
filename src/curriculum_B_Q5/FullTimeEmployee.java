package curriculum_B_Q5;

// 正社員クラス

public class FullTimeEmployee extends Employee5 {
	int salary; // 月給

	public FullTimeEmployee(String employeeId, String name, int salary) {
		super(employeeId, name);
		this.salary = salary;
	}

	@Override
	void showInfo() {
		System.out.println("【正社員】 社員ID: " + employeeId + ", 名前: " + name + ", 給与: " + salary + "円");
	}
}
