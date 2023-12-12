package com.callor.student.exec;

import com.callor.student.service.StudentServiceV3;

public class StudentExecB {
public static void main(String[] args) {
	StudentServiceV3 serviceV3 = new StudentServiceV3();
	serviceV3.inputStudents();
	serviceV3.printStudent();
}
}
