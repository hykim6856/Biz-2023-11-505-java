package com.callor.student.service;

import java.util.Scanner;

import com.callor.score.utils.Line;

public class StartService {
	private StudentServiceV3A serviceV3A = null;
	private Scanner scan = null;
	private String[] menuItems = null;

	public StartService() {
		serviceV3A = new StudentServiceV3A();
		scan = new Scanner(System.in);
		menuItems = new String[] { "1. 학생정보 입력", "2. 학생정보 가져오기", "3. 학생정보 조회", "4. 학생정보 출력"

		};

	}

	public void mainMenu() {
		Line.dLine(50);
		System.out.println("한울고교 학사관리");
		Line.dLine(50);
		System.out.println("업무를 선택해 주세요");
		Line.sLine(50);
		/*
		 * System.out.println("1. 학생정보 입력"); System.out.println("2. 학생정보 조회");
		 * System.out.println("3. 학생정보 출력");
		 */
		for (int i = 0; i < menuItems.length; i++) {
			System.out.println(menuItems[i]);
		}
		System.out.println("QUIT. 종료");
		Line.sLine(50);

	}// end mainMenu

	public int selectMenu() {
		String str = null;
		while (true) {
			System.out.print("업무선택 >> ");
			str = scan.nextLine();
			if (str.equalsIgnoreCase("QUIT"))
				return -1;
			int intStr = 0;
			try {

				intStr = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("**정수를 제대로 입력해주세요.**");
				continue;
			}

			if (intStr > menuItems.length || intStr < 1) {
				System.out.printf("**업무 선택은 1~ %d 까지입니다.**", menuItems.length);
				continue;
			}
			// 여기에 코드가 다다르면 정상적으로 업무를 선택했다는 것.
			return intStr;
			

		} // end while
	}// end select

	public void startApp() {
		while (true) {
			int menuId = this.selectMenu();
			if (menuId == -1) {
				break;
			} else if (menuId == 1) {
				serviceV3A.inputStudents();
			} else if (menuId == 2) {
				serviceV3A.loadStudent();
			} else if (menuId == 4) {
				serviceV3A.printStudent();
			}
		}
	}
}
