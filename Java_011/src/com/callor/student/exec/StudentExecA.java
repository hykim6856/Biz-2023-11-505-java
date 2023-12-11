package com.callor.student.exec;

import com.callor.student.service.StudentServiceV2;

public class StudentExecA {
public static void main(String[] args) {
	
	StudentServiceV2 stServiceV2 = new StudentServiceV2();
	stServiceV2.inputStudent();
	stServiceV2.printStudent();
	
}
	
}
