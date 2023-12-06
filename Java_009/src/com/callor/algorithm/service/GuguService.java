package com.callor.algorithm.service;

import java.util.Scanner;

import com.callor.algorithm.utils.Line;

public class GuguService {

	Scanner scan = null;

	public GuguService() {
		scan = new Scanner(System.in);

	}

	public int inputNum() {
		System.out.print("입력해주세요>>");

		String str = scan.nextLine();

		int num = 0;
		try {
			num = Integer.valueOf(str);
		} catch (Exception e) {
			System.out.println("정수를 정확히 입력해주세요.");
		}
		return num;
	}

	public void printGugu(int num) {
		System.out.println(num + "단 구구단");
		Line.sLine(50);
		for (int i = 0; i < 9; i++) {
			System.out.printf("%d x %d = %d \n", num, i+1, num*(i+1));
		}

		Line.dLine(50);
	}
}
