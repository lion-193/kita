package curriculum_B_Q3;

public class Main {
	public static void main(String[] args) {
		
		// カプセル化
		Employee e = new Employee();
		e.setEmployeeId("E002");
		e.setName("田中花子");
		System.out.println("社員ID: " + e.getEmployeeId() + ", 名前: " + e.getName());
		// 社員ID: E002, 名前: 田中花子
	}
}
