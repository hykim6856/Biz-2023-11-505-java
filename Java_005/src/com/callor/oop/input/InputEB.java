package com.callor.oop.input;

import java.util.Scanner;

public class InputEB {
	public static void main(String[] args) {
		// nums 의 타입은? : 정수형 배열
		int[] nums = new int[3];
		// Scanner 클래스 타입은?
		// scanner class type, scanner 클래스 type의 객체
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < nums.length; i++) {
			System.out.printf("정수 d% >> ", i + 1);
			// str 의 정체는 ?: 문자열형 변수,
			// 문자열 클래스의 객체, 문자열형 객체
			String str = scan.nextLine();
			nums[i] = Integer.valueOf(str);

		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);

		}
		System.out.println("=".repeat(50));
		for (int i = 0; i < 3; i++) {
			System.out.println(nums[i]);
		}
		/*
		 * 
		 * System.out.print("정수 2 >>"); str = scan.nextLine(); nums[1] =
		 * Integer.valueOf(str);
		 * 
		 * System.out.print("정수 3 >>"); str = scan.nextLine(); nums[2] =
		 * Integer.valueOf(str);
		 * 
		 */
	}
}
