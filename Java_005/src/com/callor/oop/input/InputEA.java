package com.callor.oop.input;

import java.util.Scanner;

public class InputEA {
	public static void main(String[] args) {

		int[] nums = new int[3];
		Scanner scan = new Scanner(System.in);

	//	String[] str = new String[3];
		System.out.print("정수 1 >>");
		String str = scan.nextLine();
		nums[0] = Integer.valueOf(str);
		
		System.out.print("정수 2 >>");
		str = scan.nextLine();
		nums[1] = Integer.valueOf(str);
		
		System.out.print("정수 3 >>");
		str = scan.nextLine();
		nums[2] = Integer.valueOf(str);

		System.out.println("=".repeat(50));
		for (int i = 0; i < 3; i++) {
			System.out.print(nums[i] + "\n");
		}

	}
}
