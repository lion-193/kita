package curriculum_B_Q5;

// 契約社員クラス

public class ContractEmployee extends Employee5 {
	int hourlyWage; // 時給

	public ContractEmployee(String employeeId, String name, int hourlyWage) {
		super(employeeId, name);
		this.hourlyWage = hourlyWage;
	}

	@Override
	void showInfo() {
		System.out.println("【契約社員】 社員ID: " + employeeId + ", 名前: " + name + ", 時給: " + hourlyWage + "円");
	}
}

// TODO Auto-generated method stub
