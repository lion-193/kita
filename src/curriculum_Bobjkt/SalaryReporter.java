package curriculum_Bobjkt;

import java.util.List;

// 出力（レポート）だけ担当
// 具象クラスではなく抽象（Employee7=HasName & Payable）に依存

public class SalaryReporter {

	// 社員リストの「日給（hours時間）」を出力する
	// @param people Employee7（HasName & Payable を満たす）一覧
	// @param hours 労働時間

	public void printDaily(List<? extends Employee7> people, int hours) {
		for (Employee7 p : people) {
			int amount = p.costForHours(hours); // 計算はオブジェクトに委譲（多態性）
			System.out.println(p.toString() + "　日給：" + hours + "時間　給料：" + amount + "円");
		}
	}
}
