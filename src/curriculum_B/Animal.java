package curriculum_B;

public class Animal {

	// Q5
	private String name; // 動物名は文字列でOK
	private double height; // 体長は数値なので double
	private int speed; // 速度は数値なのでint

	// フィールド（変数）

	public String getName() {
		return name;
	}
	// nameのgetterとsetter 

	public void setName(String name) {
		this.name = name;
	}
	// thisで自分のnameに代入

	public double getHeight() {
		return height;
	}
	// heightのgetterとsetter

	public void setHeight(double height) {
		this.height = height;
	}
	// thisで自分のheightに代入

	public int getSpeed() {
		return speed;
	}
	// speedのgetterとsetter

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	// thisで自分のspeedに代入
}
//TODO Auto-generated method stub