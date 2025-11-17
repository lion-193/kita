package curriculum_B_Q6;

import java.util.ArrayList;
import java.util.List;

// 実行クラス

public class Main6 {

	public static void main(String[] args) {

		List<Billable> staff = new ArrayList<>();

		staff.add(new FullTimeEmployee2("E001", "田中太郎"));
		staff.add(new FullTimeEmployee2("E002", "山田次郎"));
		staff.add(new ContractEmployee2("E003", "佐藤花子"));
		staff.add(new ContractEmployee2("E004", "小山芽衣"));

		int hoursWorked = 9;

		for (Billable b : staff) {
			int salaly = b.costForDay(hoursWorked);
			System.out.println(b.toString() + "ID:" + b.getId() + "名前：" + b.getName() + "日給：" + hoursWorked + "時間"
					+ "給料:" + salaly + "円");

		}
	}
}
