package curriculum_B_Q7;

import java.util.ArrayList;
import java.util.List;

// 依存の組み立てと実行だけ
// Reporterへは抽象（Employee7）で渡す

public class Main {
	public static void main(String[] args) {
		// 社員（正社員×2、契約×2）を作成（拡張は追加するだけ）
		List<Employee> members = new ArrayList<>();
		members.add(new FullTimeEmployee("田中太郎"));
		members.add(new FullTimeEmployee("山田次郎"));
		members.add(new ContractEmployee("佐藤花子"));
		members.add(new ContractEmployee("小山芽衣"));

		// 例9時間労働のレポート
		new SalaryReporter().printDaily(members, 9);
	}
}
