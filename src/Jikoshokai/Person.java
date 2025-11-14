package Jikoshokai;

class Person {
	// インスタンスフィールドを定義

	String name;
	int age;
	double height;
	double weight;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	double bmi() {
		double heightMeter = this.height / 100;
		return this.weight / (heightMeter * heightMeter);
	}

	void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + this.bmi() + "です");
	}
}
