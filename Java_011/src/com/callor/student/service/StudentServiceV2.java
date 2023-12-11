
package com.callor.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;

public class StudentServiceV2 {

	private List<StudentDto> students = null;
	// 배열의 인덱스를 위한 변수 선언

	private int 학번 = 0;
	private int 이름 = 1;
	private int 학과 = 2;
	private int 학년 = 3;
	private int 전화번호 = 4;
	private int 주소 = 5;

	private Scanner scan = null;
	private String[] stdTitle = null;

	public StudentServiceV2() {
		scan = new Scanner(System.in);
		students = new ArrayList<StudentDto>();

		// 각 입력 항목의 제목을 배열로 생성하기
		stdTitle = new String[] { "학번", "이름", "학과", "학년", "전화번호", "주소" };

	}

	public void inputStudent() {
		// 키보드로 입력한 문자열(각 요소의 값)을 저장할 배열
		// stdTitle 배열의 개수와 동일한 개수의 inputstr배열을 생성
		String[] inputStr = new String[stdTitle.length];

		String str = null;
		while (true) {
			// for() 반복문을 이용하여 입력 받기를 코드 줄이기
			for (int index = 0; index < stdTitle.length; index++) {
				System.out.println(stdTitle[index] + " 입력 >>");
				str = scan.nextLine();
				inputStr[index] = str;
			}
			if (str.equalsIgnoreCase("QUIT")) {
				break;
			}

			StudentDto stdDto = new StudentDto();
			stdDto.num = inputStr[학번];
			stdDto.name = inputStr[이름];
			stdDto.dept = inputStr[학과];
			stdDto.grade = inputStr[학년];
			stdDto.tel = inputStr[전화번호];
			stdDto.addr = inputStr[주소];

			students.add(stdDto);

		}

	}

	public void printStudent() {
		for (int index = 0; index < stdTitle.length; index++) {
			System.out.print(stdTitle[index] + "\t");
		}
		System.out.println();
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
