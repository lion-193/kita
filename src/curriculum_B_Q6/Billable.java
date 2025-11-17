package curriculum_B_Q6;

// インターフェイス

public interface Billable {

	int costForDay(int hoursWorked);
	// 日給計算

	String getName();

	// 名前取得
	String getId();
	// ID取得

}
