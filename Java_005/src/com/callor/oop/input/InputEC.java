package com.callor.oop.input;

import java.util.Scanner;

/*
 * 입력받은 문자열형 정수를 정수로 변환하는 과정에서 익셉션이 자주발생하여 익셉션 처리를 하자
 */
public class InputEC {
	public static void main(String[] args) {

		int[] nums = new int[3];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < nums.length; i++) {
			System.err.println("끝내려면 QUIT를 입력하세요");
			System.out.printf("정수 %d >> ", i + 1);
			String str = scan.nextLine();
			if(str.equals("QUIT"))break;
			try {
				nums[i] = Integer.valueOf(str);

			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해주세요");
				i--;
				continue;
			}
		}
		System.out.println("=".repeat(50));
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);

		}
		/*
		System.out.println("=".repeat(50));
		for (int i = 0; i < 3; i++) {
			System.out.println(nums[i]);
		}*/
	}
}
