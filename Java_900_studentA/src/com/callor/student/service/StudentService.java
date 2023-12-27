package com.callor.student.service;

import com.callor.student.models.StudentDto;

/*
 * 
 */
public interface StudentService {
	public void loadStudent();

	public void inputStudent();

	// 학생 이름을 매개변수로 전달받아 학생 정보 검색하기
	// 검색된 학생정보를 Dto에 담아 return 하기

	public StudentDto searchStudent(String name);

	// 학생정보를 매개 변수로 전달 받아 화면에 출력하기
	public void printStudent(StudentDto stdDto);

}
