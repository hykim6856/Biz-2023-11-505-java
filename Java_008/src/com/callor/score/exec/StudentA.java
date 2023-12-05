package com.callor.score.exec;


import com.callor.score.service.StudentService;

public class StudentA {
	public static void main(String[] args) {

	String data = "src/com/callor/score/service/student.txt";
	
	
	StudentService sService = new StudentService(data);
	sService.loadStudents();
	//sService.students = null;
	sService.countStudent();
	sService.printStudent();
	
	}
}
