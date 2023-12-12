package com.callor.student.exec;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StudentServiceImplV1;
import com.callor.student.service.impl.StudentServiceImplV2;

public class StudentExA {

	public static void main(String[] args) {
		StudentService stService = new StudentServiceImplV1();
		StudentServiceImplV1 stService1 = new StudentServiceImplV1();
		List<Integer> nums = new ArrayList<Integer>();
		ArrayList<Integer> nums2 = new ArrayList<Integer>();

		nums = new ArrayList<Integer>();
		nums = new LinkedList<Integer>();
		nums = new Vector<Integer>();

		stService = new StudentServiceImplV1();
		stService = new StudentServiceImplV2();
	}
}
