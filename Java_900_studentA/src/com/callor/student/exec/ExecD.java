package com.callor.student.exec;

import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StudentServiceImplV2;

public class ExecD {

	public static void main(String[] args) {
		String stdFile = "src/student.csv";
		StudentService stService2 = new StudentServiceImplV2(stdFile);
		stService2.loadStudent();
		stService2.inputStudent();

	}
}
