package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.utils.Line;

public class ScannerBB {

	public static int inputNum(String title) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print(title + " 정수를 입력하세요>>");
			String str = scan.nextLine();
			int num = 0;
			try {
				num = Integer.valueOf(str);

			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해주세요.");
				continue;
			}
			return num;

		}
	}

	public static void main(String[] args) {
		int num1 = inputNum("첫번째");
		int num2 = inputNum("두번째");

		Line.sLine(50);
		System.out.printf("%d + %d = %d \n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d \n", num1, num2, num1 - num2);
		System.out.printf("%d x %d = %d \n", num1, num2, num1 * num2);
		System.out.printf("%d ÷ %d = %d \n", num1, num2, num1 / num2);
		System.out.printf("%d MOD %d = %d \n", num1, num2, num1 % num2);
		Line.dLine(50);
	}
}
