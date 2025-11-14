package curriculum_B;

public abstract class Employee4 {

	// 継承
	private final String employeeId;
	private final String name;

	public Employee4(String id, String name) {
		this.employeeId = id;
		this.name = name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public abstract int calculateDailyWage(int hoursWorked);

	// 正社員：8h超過は25%割増（時給1200）
	public static class FullTimeEmployee extends Employee4 {
		private static final int HOURLY_RATE = 1200;

		public FullTimeEmployee(String id, String name) {
			super(id, name);
		}

		@Override
		public int calculateDailyWage(int h) {
			int ot = Math.max(0, h - 8), reg = h - ot;
			return reg * HOURLY_RATE + (int) (ot * HOURLY_RATE * 1.25);
		}
	}

	// パート：割増なし（時給1000）
	public static class PartTimeEmployee extends Employee4 {
		private static final int HOURLY_RATE = 1000;

		public PartTimeEmployee(String id, String name) {
			super(id, name);
		}

		@Override
		public int calculateDailyWage(int h) {
			return h * HOURLY_RATE;
		}
	}
}
