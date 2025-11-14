package curriculum_B;

public class Employee3 {

	// カプセル化
	private String employeeId; // 外から直接触らせない
	private String name;

	public void setEmployeeId(String id) {
		this.employeeId = id;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
