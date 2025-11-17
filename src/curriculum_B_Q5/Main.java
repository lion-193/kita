package curriculum_B_Q5;

// 実行クラス

public class Main {

	public static void main(String[] args) {

		        // ポリモーフィズムの利用
		        Employee e1 = new FullTimeEmployee("E001", "田中太郎", 300000);
		        Employee e2 = new ContractEmployee("E002", "佐藤花子", 1500);

		        // 同じメソッド名showInfo()でも、呼ばれる内容が違う
		        e1.showInfo();
		        e2.showInfo();
		    }
		}

		// TODO Auto-generated method stub
