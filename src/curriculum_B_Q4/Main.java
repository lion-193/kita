package curriculum_B_Q4;

public class Main {
	public static void main(String[] args) {
		Employee f = new Employee.FullTimeEmployee("F001", "正社員A");
		Employee p = new Employee.PartTimeEmployee("P001", "パートB");

		System.out.println("正社員の給与: " + f.calculateDailyWage(9) + " 円"); // 11100
		System.out.println("パート社員の給与: " + p.calculateDailyWage(9) + " 円"); // 9000
	}
}
