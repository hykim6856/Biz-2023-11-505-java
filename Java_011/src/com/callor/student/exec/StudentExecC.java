package com.callor.student.exec;

import com.callor.student.service.StudentServiceV3A;

public class StudentExecC {
public static void main(String[] args) {
	StudentServiceV3A serviceV3 = new StudentServiceV3A();
	serviceV3.inputStudents();
	serviceV3.printStudent();
}
}
