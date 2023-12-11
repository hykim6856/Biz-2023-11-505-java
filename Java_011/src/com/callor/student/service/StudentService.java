package com.callor.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;

public class StudentService {
	private List<StudentDto> students = null;
	private Scanner scan = null;
	
	public StudentService() {
	scan = new Scanner(System.in);
	students = new ArrayList<StudentDto>();
	}
	
	public void inputStudent() {
	String str = null;
	
	StudentDto studentDto = new StudentDto();
	System.out.print("학번을 입력하세요>>");
	str = scan.nextLine();
	studentDto.num = str;
	System.out.print("이름을 입력하세요>>");
	str = scan.nextLine();
	studentDto.name = str;
	System.out.print("학과를 입력하세요>>");
	str = scan.nextLine();
	studentDto.dept = str;
	System.out.print("학년을 입력하세요>>");
	str = scan.nextLine();
	studentDto.grade = str;
	System.out.print("전번을 입력하세요>>");
	str = scan.nextLine();
	studentDto.tel =str;
	System.out.print("주소를 입력하세요>>");
	str = scan.nextLine();
	studentDto.addr =str;
	
	
	students.add(studentDto);
	}
	
	public void inputStudent(int count) {
		for(int i = 0 ; i < count; i++)
		this.inputStudent();
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
