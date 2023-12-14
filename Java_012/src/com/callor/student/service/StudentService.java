package com.callor.student.service;

/*
 *    StudentService 클래스를 만드는데에 꼭 필요한 method 들은 무엇인가?
 *    inputStudent()
 *    inputStudents()
 *    loadStudent()
 *    printStudent()
 *    
 *    interface 는 클래스의 설계도이다
 *    interface 를 implements 한 클래스는 interface 에 정의된
 *    method 를 반드시 만들어야한다. (반드시 구현해야한다.)
 */
public interface StudentService {
	// 클래스를 설계할때 참조할 method의 prototype 정의
	// 코드블럭[{}] 없다.
	public boolean inputStudent();// 한 학생의 정보입력

	public void inputStudents();// 여러 학생의 정보입력

	public void loadStudents();// 파일에 저장된 학생정보 메모리로 로드

	public void saveStudent();// 메모리에 보관된 학생정보를 파일에 저장하기

	public void printStudent(); // 메모리에 보관된 학생정보 출력하기
}
