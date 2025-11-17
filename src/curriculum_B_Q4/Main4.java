package curriculum_B_Q4;

public class Main4 {
	public static void main(String[] args) {
		Employee4 f = new Employee4.FullTimeEmployee("F001", "正社員A");
		Employee4 p = new Employee4.PartTimeEmployee("P001", "パートB");

		System.out.println("正社員の給与: " + f.calculateDailyWage(9) + " 円"); // 11100
		System.out.println("パート社員の給与: " + p.calculateDailyWage(9) + " 円"); // 9000
	}
}
