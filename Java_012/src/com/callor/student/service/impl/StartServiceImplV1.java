package com.callor.student.service.impl;

import java.util.Scanner;

import com.callor.student.service.StartService;
import com.callor.student.service.StudentService;
import com.callor.student.ultils.Line;

public class StartServiceImplV1 implements StartService {
	protected Scanner scan = null;
	protected StudentService stService = null;

	public StartServiceImplV1() {
		scan = new Scanner(System.in);
		stService = new StudentServiceImplV1();
	}

	@Override
	public void mainMenu() {

		Line.dLine(80);
		System.out.println("한울고교 학사관리");
		Line.dLine(80);
		System.out.println("업무를 선택해주세요");
		Line.sLine(80);
		System.out.println("1. 학생정보 입력");
		System.out.println("2. 학생정보 조회");
		System.out.println("3. 학생정보 출력");
		System.out.println("QUIT. 종료");
		Line.sLine(80);

	}

	@Override
	public Integer selectMenu() {
		while (true) {

			System.out.print("업무 선택 (QUIT:종료)>> ");
			String str = scan.nextLine();
			System.out.println();
			if (str.equalsIgnoreCase("QUIT")) {
				System.out.println("종료");
				return null;
			}
			int intStr = 0;
			try {

				intStr = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해주세요");
				continue;
			}

			if (intStr < 1 || intStr > 3) {
				System.out.printf("1~%d범위 내의 숫자를 입력해주세요.\n", 3);
				continue;
			}
			return intStr;
		}
	}

	@Override
	public void startApp() {
		// TODO Auto-generated method stub

	}

}
