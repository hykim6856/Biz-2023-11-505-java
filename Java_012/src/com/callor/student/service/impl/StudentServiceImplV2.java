package com.callor.student.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.callor.student.models.StIndex;
import com.callor.student.models.StudentDto;

public class StudentServiceImplV2 extends StudentServiceImplV1 {

	protected String stDataFile = null;
	// private Scanner fileScan = null;

	public StudentServiceImplV2() {
		// 두번째 생성자에게 파일의 정보를 전달하는 실행
		this("src/com/callor/student/data/student.txt");
	}

	public StudentServiceImplV2(String stdataFile) {
		// v1 의 생성자를 호출하여 키보드 스캡을 사용할 수 있도록 준비
		super();
		this.stDataFile = stdataFile;
	}

	@Override
	public void loadStudents() {
		Scanner fileScan = null;

		// 파일을 읽기 위한 준비를 하는 곳
		InputStream is = null;
//		fileScan = new Scanner();

		try {
			is = new FileInputStream(stDataFile);

		} catch (Exception e) {
			e.printStackTrace();
		}
		fileScan = new Scanner(is);

		/*
		 * 파일에서 데이터를 읽어 계속해서 더하면 데이터가 계속쌓임 로드 할대는 기존의 리스트를 새로 생성하여 초기화하여야함.
		 */

		students = new ArrayList<StudentDto>();

		// student.txt 파일에서 학생정보 읽어오기
		while (fileScan.hasNext()) {
			String line = fileScan.nextLine();
			String[] student = line.split(",");

			StudentDto stdDto = new StudentDto();
			stdDto.stdNum = student[StIndex.학번.getIndex()];
			stdDto.stdName = student[StIndex.이름.getIndex()];
			stdDto.stdDept = student[StIndex.학과.getIndex()];
			stdDto.stdGrade = student[StIndex.학년.getIndex()];
			stdDto.stdTel = student[StIndex.전화번호.getIndex()];
			stdDto.stdAddr = student[StIndex.주소.getIndex()];
			students.add(stdDto);

		}
		fileScan.close();
	}

	/*
	 * students 리스트에 보관중인 학생정보 리스트를 student.txt 파일에 영구 저장하는 method
	 */
	@Override
	public void saveStudent() {

		OutputStream fos = null;
		// sysout 과 형제간.
		// sysout 에는 print ** method 들이 있고 이 method 들을 사용하여 화면에 메모리 내용을 출력하였다.
		// print Writer 는 OutputStream 과 연결되어 파일에 print** method 들을 사용하여 파일에 데이터를 쓸 수
		// 있다(저장하기)
		PrintWriter fileOut = null;

		try {
			// 어떤 파일에 기록을 할 것인지 연결하는 절차
			fos = new FileOutputStream(stDataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 기록할 파일을 printWriter 에 연결하기
		fileOut = new PrintWriter(fos);

		// printWriter가 준비 되면
		// sysout 처럼 같은 방식으로 파일에 문자열을 기록할 수있다.
		for (StudentDto dto : students) {
			fileOut.printf("%s,", dto.stdNum);
			fileOut.printf("%s,", dto.stdName);
			fileOut.printf("%s,", dto.stdDept);
			fileOut.printf("%s,", dto.stdGrade);
			fileOut.printf("%s,", dto.stdTel);
			fileOut.printf("%s\n", dto.stdAddr);
		} // 파일에 내용기록이 끝나면 반드시 프린트 라이터를 닫아야한다.
			// 이 과정을 생략하면 파일이 계속 열린 상태가 되고 기록한 내용은 완전 저장되지 않ㄴ는다.
			// 또한 이 상태의 파일은 삭제도 할 수 없게 된다.
			// 다만 윈도우를 재 시작하기전까지
		fileOut.close();
	}
}
