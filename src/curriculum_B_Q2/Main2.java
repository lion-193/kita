package curriculum_B_Q2;

public class Main2 {
    public static void main(String[] args) {
    	
    	// クラスとオブジェクト
        System.out.println("クラスとオブジェクト");

        Employee2 e2 = new Employee2();  // Employee2を呼び出す
        e2.employeeId = "E001";
        e2.name = "佐藤太郎";
        e2.showInfo();  // 出力: 社員ID:E001, 名前:佐藤太郎
    }
}
