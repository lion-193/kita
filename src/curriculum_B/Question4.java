package curriculum_B;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		// Q1
		int[] nums1 = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < nums1.length; i++) {
			System.out.println(nums1[i]);
		}

		// Q2
		int[] nums2 = { 10, 20, 30, 40, 50 };
		for (int i = nums2.length - 1; i >= 0; i--) {
			System.out.println(nums2[i]);
		}

		// Q3 
		int[] nums3 = { 3, 5, 7, 9, 11 };
		int sum = 0;
		for (int i = 0; i < nums3.length; i++) {
			sum += nums3[i];
		}
		System.out.println("合計値: " + sum);

		// Q4
		int[] nums4 = { 12, 7, 9, 21, 5, 18 };
		int max = nums4[0];
		int min = nums4[0];
		for (int i = 1; i < nums4.length; i++) {
			if (nums4[i] > max) {
				max = nums4[i];
			}
			if (nums4[i] < min) {
				min = nums4[i];
			}
		}
		System.out.println("最大値:" + max);
		System.out.println("最小値:" + min);

		// Q5
		int[] nums5 = { 1, 2, 3, 4, 5 };
		for (int n : nums5) {
			System.out.println(n * 2);
		}

		// Q6
		int[] arr1 = { 4, 7, 10, 15, 20 };
		Scanner sc = new Scanner(System.in);
		System.out.print("検索する数値を入力してください：");
		int n = sc.nextInt(); // ← ここが重要！入力から取得

		boolean found = false;

		for (int v : arr1) {
			if (v == n) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("入力した値は配列に含まれています");
		} else {
			System.out.println("含まれていません");
		}

		// Q7
		int[][] arr2 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.println(arr2[i][j]);
			}
		}

		// Q8
		int[][] arr3 = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 }, };
		int sum1 = 0;
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				sum1 += arr3[i][j];
			}
		}
		System.out.println("合計値:" + sum1);

		// Q9
		int[][] arr4 = { { 12, 15, 8 }, { 6, 19, 25 }, { 30, 2, 10 }, };
		int max1 = arr4[0][0];
		int min1 = arr4[0][0];
		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4[i].length; j++) {
				int v = arr4[i][j];
				if (v > max1) {
					max1 = v;
				}
				if (v < min1) {
					min1 = v;
				}
			}
		}
		System.out.println("最大値:" + max1);
		System.out.println("最小値:" + min1);

		// Q10
		int[][][] arr5 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
		for (int i = 0; i < arr5.length; i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				for (int k = 0; k < arr5[i][j].length; k++) {
					System.out.println(arr5[i][j][k]);
				}
			}
		}
		// TODO Auto-generated method stub

	}

}
