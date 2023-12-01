package com.callor.oop.keyboard;

import java.util.Scanner;

public class KeyboardAB {

	public static void main(String[] args) {
		int num = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("=".repeat(50));
		System.out.println("10 이상의 정수를 입력하세요");
		System.out.print("정수 입력 (QUIT 종료) >>");
		String str = scan.nextLine();

		try {
			num = Integer.valueOf(str);
		} catch (Exception e) {
			System.out.println("-".repeat(50));
			System.out.printf(" (%s)를 입력하셨습니다.", str);
			System.out.println("정수를 정확히 입력해주세요");
			System.out.println("-".repeat(50));
			return;
		}

		if (num < 10) {
			System.out.println("-".repeat(50));
			System.out.printf("%d 는 10보다 작습니다. 10 이상의 정수를 입력해주세요\n", num);
			System.out.println("-".repeat(50));
			return;
		}

		System.out.printf("1~%d 안의 짝수는 \n", num);
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("입니다.");
		System.out.println("=".repeat(50));

		/*
		 * 
		 * while (true) { if (str.equals("QUIT")){ break; }
		 * 
		 * 
		 * continue; } System.out.println("종료");
		 */
	}
}
