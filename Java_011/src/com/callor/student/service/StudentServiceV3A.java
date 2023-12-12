package com.callor.student.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.utils.Line;
import com.callor.student.models.StudentDto;

public class StudentServiceV3A {

	private Scanner scan = null;
	private List<StudentDto> students = null;

	public StudentServiceV3A() {
		scan = new Scanner(System.in);
		students = new ArrayList<StudentDto>();
	}

	private String itemInput(String title) {

		while (true) {
			System.out.print(title + " 입력(QUIT:종료) >> ");
			String inputStr = scan.nextLine();

			if (inputStr.isBlank()) {
				System.out.printf("** %d 값은 반드시 입력**", title);
				continue;
			}

			// 키보드로 QUIT 를 입력하면?
			if (inputStr.equals("QUIT")) {
				return null;
			}
			;
			return inputStr;
		}
	}

//학번을 배개 변수로 전달받아 students 리스트에서 검색하여
	// 일치하는 학생정보가 있으면 그 정보를 통채로 return*****
	private StudentDto selectStdNum(String num) {
		// students 는 list type이다
		// students 의 요소는 StudentDto type 이다.
		// 이 명령은 students 리스트 개수만큼 반복하라
		// 반복하면서 students 리스트의 개별요소를 (get)읽기 하여 StudentDto type 인 dto 에 할당하여
		// 코드블럭({})에 전달 하라.

		for (StudentDto dto : students) {
			if (dto.num.equals(num))
				return dto;

		}
		return null;

	}

	// 한 학생의 정보를 입력 받는 method
	public boolean inputStudent() {
		StudentDto stdDto = new StudentDto();

		while (true) {
			stdDto.num = this.itemInput("학번");
			if (stdDto.num == null) {
				return false;
			}
			/*
			 * selectStdnum() method 에 학번을 보내고 return값을 받아서 결과 null이 아니면 중복임을 판단학.
			 */
			// if(this.selectStdNum(stdDto.num) != null){
			StudentDto dto1 = this.selectStdNum(stdDto.num);
			if (dto1 != null) {
				System.out.println("중복");
				continue;
			}

			for (StudentDto dto : students) {
				if (dto.num.equals(stdDto.num)) {
					System.out.println("***학번중복");
					continue;
				}

			}
			break;
		}
		stdDto.name = this.itemInput("이름");
		if (stdDto.name == null)
			return false;
		stdDto.dept = this.itemInput("학과");
		if (stdDto.dept == null)
			return false;
		stdDto.grade = this.itemInput("학년");
		if (stdDto.grade == null)
			return false;
		stdDto.tel = this.itemInput("전화번호");
		if (stdDto.tel == null)
			return false;
		stdDto.addr = this.itemInput("주소");
		if (stdDto.addr == null)
			return false;

		students.add(stdDto);
		return true;
	}// end inputStudent()

	public void inputStudents() {
		while (true) {
			boolean byes = this.inputStudent();
			// if(byes==false) {
			// if(byes!=true
			if (!byes) {

				break;
			}

		}
	}

	public void printStudent() {
		Line.dLine(50);
		System.out.println("한울 고교 학생정보");
		Line.dLine(50);

		System.out.printf(" 학번\t이름\t학과\t학년\t전화번호\t주소\n");
		Line.sLine(50);
		for (StudentDto sDto : students) {
			System.out.printf("%s\t", sDto.num);
			System.out.printf("%s\t", sDto.name);
			System.out.printf("%s\t", sDto.dept);
			System.out.printf("%s\t", sDto.grade);
			System.out.printf("%s\t", sDto.tel);
			System.out.printf("%s\t\n", sDto.addr);
		}
		Line.sLine(50);
	}// print
	public void loadStudent() {
		String stFile = "src/com/callor/student/models/student.txt";

		InputStream is = null;
		Scanner fileScan = null;
		try {
			is = new FileInputStream(stFile);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		fileScan = new Scanner(is);
		
		while(fileScan.hasNext()) {
			String line = fileScan.nextLine();
			String[] stds = line.split(",");
			StudentDto stDto = new StudentDto();
			
			stDto.num = stds[0];
			stDto.name = stds[1];
			stDto.dept = stds[2];
			stDto.grade = stds[3];
			stDto.tel = stds[4];
			stDto.addr = stds[5];
			students.add(stDto);
		}
		fileScan.close();
	}
}
