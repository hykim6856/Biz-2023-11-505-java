package com.callor.student.service.impl;

import java.util.Scanner;

import com.callor.student.service.StartService;
import com.callor.student.service.StudentService;
import com.callor.student.ultils.Line;

public class StartServiceImplV1 implements StartService {
	protected Scanner scan = null;
	protected StudentService stService = null;

	/*
	 * StarService 에서는 StudentService를 필수로한다. StartService 클래스의 기능을 추가하는 코드가 계속 만들어질
	 * 경우 또한 StudentService 클래스의 기능을 추가하는 코드가 계속 만들어진다.
	 * 
	 * StartServcieV1, StartServiceV2... 등으로 파일 생성되고, StudentServiceV1,
	 * StudentServiceV2.. 등올 파일 생성되고
	 * 
	 * 이 두개의 파일이 서로 연동되어 코드가 진행된다.
	 * 
	 * 이 상황에서 어떤 StartService 와 StudentService 를 연결할 것인지 항상 고민해야하고, 필요에 따라
	 * StartServicec 코드를 변경해야한다.
	 * 
	 * 이러한 상황을 StartService 와 StudentService 간에 결합도가 높다한다.
	 * 
	 * 그래서 StartService의 생성자를 통하여 StudentsService의 객체를 주입받은(Inject)코드로 생성자를 변경하였다.
	 * 
	 */
	public StartServiceImplV1(StudentService stService) {
		scan = new Scanner(System.in);
		this.stService = stService; // new StudentServiceImplV1();
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
