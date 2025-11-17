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
		a.setHeight(2.1);
		a.setSpeed(80);
		// setterで値をセット

		System.out.println("動物名：" + a.getName());
		System.out.println("体長：" + a.getHeight() + "m");
		System.out.println("速度：" + a.getSpeed() + "km/h");
	}
}