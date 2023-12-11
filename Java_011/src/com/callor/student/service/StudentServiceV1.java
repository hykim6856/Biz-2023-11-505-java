package com.callor.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;

public class StudentServiceV1 {
	private List<StudentDto> students = null;
	private Scanner scan = null;

	public StudentServiceV1() {
		scan = new Scanner(System.in);
		students = new ArrayList<StudentDto>();

	}

	public boolean inputStudent() {
		StudentDto studentDto = new StudentDto();
		System.out.print("학번을 입력하세요>>");
		String stdNum = scan.nextLine();
		if (stdNum.equalsIgnoreCase("QUIT")) {
			return false;
		}
		// ====================================
		int size = students.size();

		boolean bYes = check(size, stdNum);
		if (bYes) {
			System.out.println("학번중복");
			return false;
		}
		// ====================================
		System.out.print("이름을 입력하세요>>");
		String stdName = scan.nextLine();
		if (stdName.equalsIgnoreCase("QUIT")) {
			return false;
		}
		System.out.print("학과를 입력하세요>>");
		String stdDept = scan.nextLine();
		if (stdDept.equalsIgnoreCase("QUIT")) {
			return false;
		}
		System.out.print("학년을 입력하세요>>");
		String stdGrade = scan.nextLine();
		if (stdGrade.equalsIgnoreCase("QUIT")) {
			return false;
		}
		System.out.print("전번을 입력하세요>>");
		String stdTel = scan.nextLine();
		if (stdTel.equalsIgnoreCase("QUIT")) {
			return false;
		}
		System.out.print("주소를 입력하세요>>");
		String stdAddr = scan.nextLine();
		if (stdAddr.equalsIgnoreCase("QUIT")) {
			return false;
		}
		studentDto.num = stdNum;
		studentDto.name = stdName;
		studentDto.dept = stdDept;
		studentDto.grade = stdGrade;
		studentDto.tel = stdTel;
		studentDto.addr = stdAddr;
		students.add(studentDto);

//	students.add(studentDto);
		return true;
	}

	public boolean check(int size, String check) {

		for (int i = 0; i < size; i++) {
			if (students.get(i).equals(check)) {
				return true;
			}
		}
		return false;
	}

	public void inputStudents() {
		boolean result = true;
		while (result) {
			result = inputStudent();
		}
		System.out.println("입력 종료");
	}

	public void printStudent() {
		System.out.println("학번\t이름\t학과\t학년\t전번\t주소");
		for (StudentDto dto : students) {
			System.out.printf(" %s\t", dto.num);
			System.out.printf("%s\t", dto.name);
			System.out.printf("%s\t", dto.dept);
			System.out.printf("%s\t", dto.grade);
			System.out.printf("%s\t", dto.tel);
			System.out.printf("%s\n", dto.addr);
		}

	}

}
