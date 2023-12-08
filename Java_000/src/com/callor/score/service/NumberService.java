package com.callor.score.service;

import java.util.Scanner;

import com.callor.score.uitls.Line;

public class NumberService {
	Scanner scan = null;

	public NumberService() {
		scan = new Scanner(System.in);

	}

	public int inputNumber(String title) {
		while (true) {
			Line.dLine(50);
			System.out.print(title + "입력해주세요>>");
			String str = scan.nextLine();

			int num = 0;
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.err.println("**정수를 정확히 입력해주세요**");
				continue;
			}
			Line.sLine(50);
			return num;
		} // while
	}// end inputNumber(String title)

	public int inputNumber(String title, int start, int end) {

		while (true) {
			int num = 0;
			Line.dLine(50);
			System.out.printf("%d ~ %d 범위의 정수를 입력하세요\n", start, end);
			System.out.print(title + " 입력하세요 >> ");
			String str = scan.nextLine();
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("*정수를 정확히 입력해 주세요*");
				continue;
			}
			if (num < start || num > end) {
				System.err.printf("%d ~ %d 범위의 정수를 입력하세요\n", start, end);
				continue;
			}

			return num;
		}

	}
}
