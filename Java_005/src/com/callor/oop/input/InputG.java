package com.callor.oop.input;

import java.util.Scanner;

public class InputG {
	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean Range(int num) {
		if (num >= 2) {
			return true;
		} 
		return false;
	}

	public static void main(String[] args) {

		int num = 0;

		Scanner scan = new Scanner(System.in);
		String str = "";
		while (true) {

			System.out.print("정수(2~)입력 (QUIT:끝내기)>> ");
			str = scan.nextLine();

			if (str.equals("QUIT")) {
				System.out.println("종료");
				break;
			}
			// ====================================
			try {
				num = Integer.valueOf(str);

			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println("정수값을 정확히 입력해야합니다.");
				continue;
			}
			if (Range(num) == false) {
				System.out.println("2이상의 정수이어야합니다.");
				continue;
			}
			if(isPrime(num)==true) {
				System.out.printf("%d 는 소수입니다.\n" ,num);
			}else {
				System.out.printf("%d 는 소수가 아닙니다.\n" ,num);
			}
			if (num % 2 != 0) {
				System.out.printf("%d 는 짝수가 아닙니다.\n", num);
				continue;
			} else {
				System.out.printf("%d 는 짝수입니다.\n", num);
				continue;
			}

		}

	}
}
