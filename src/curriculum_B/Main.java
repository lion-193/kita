package curriculum_B;

public class Main {
	public static void main(String[] args) {

		// Q4
		Greeting g = new Greeting();
		// Greeting クラスのインスタンスを作成
		g.sayHello();
		// Greeting クラスの sayHello() を実行

		// Q5
		Animal a = new Animal();
		// animalクラスのインスタンス作成 

		a.setName("ライオン");
		a.setHeight("2.1km");
		a.setSpeed("80km/h");
		// setterで値をセット

		System.out.println("動物名：" + a.getName());
		System.out.println("体長：" + a.getHeight());
		System.out.println("速度：" + a.getSpeed());
		
	
	// オブジェクト指向
	// 1-基本概念
	Employee emp1 = new Employee();
	// インスタンスの作成
	emp1.name = "山田太郎";
	// 名前セット
	emp1.work();
	//メッセージの出力
	
	// 2-クラスとオブジェクト
	Employee emp2 = new Employee();
	emp2.employeeId = "E001";
	emp2.name = "佐藤太郎";
	emp2.showInfo();
	
}
	
}