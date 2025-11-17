package curriculum_B_Q6;

// 抽象クラス（全社員の共通部分をまとめる）

public abstract class Employee6 implements Billable {

	protected String id;
	protected String name;

	public Employee6(String id, String name) {
		// コンストラクタ：社員と名前を初期化
		this.id = id;
		this.name = name;
	}

// 抽象メソッド（中身は書かず、サブクラスで実装）

	@Override
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

}