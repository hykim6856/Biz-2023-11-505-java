package com.callor.student.exec;

import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StudentServiceImplV1;
import com.callor.student.service.impl.StudentServiceImplV2;

public class StudentExB {

	public static void main(String[] args) {
		StudentService stService1 = new StudentServiceImplV1();
		stService1.printStudent();

		
		stService1 = new StudentServiceImplV2();
		stService1.printStudent();
		/*StudentServiceImplV2 stService2 = new StudentServiceImplV2();
		stService1.printStudent(); */

	}
}
