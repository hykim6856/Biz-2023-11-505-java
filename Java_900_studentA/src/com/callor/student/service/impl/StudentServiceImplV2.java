package com.callor.student.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.student.exec.Line;
import com.callor.student.models.StudentDto;

public class StudentServiceImplV2 extends StudentServiceImplV1 {

	public StudentServiceImplV2(String stdFile) {
		super(stdFile);
		// TODO Auto-generated constructor stub
	}

//	/*
//	 * 학생 이름 일부를 전달받아
//	 * 학생 이름이 포함된 리스트를 출력하도록
//	 */
	@Override
	public StudentDto searchStudent(String name) {
		List<StudentDto> searchList = new ArrayList<StudentDto>();
		for (StudentDto dto : stdList) {
			/*
			 * name.trim() : name 변수에 저장된 문자열의 앞 뒤 빈칸 제거 
			 * dto.name.contains("문자열"): 
			 * dto.name
			 * 에 문자열이 포함되어있으면
			 */
			if (dto.name.contains(name.trim())) {
				searchList.add(dto);
			}
		}
		Line.dLine(100);
		System.out.println("학번\t이름\t학과\t학년\t전화번호\t주소");
		Line.sLine(100);
		for (StudentDto dto : searchList) {

			System.out.printf("%s\t", dto.name);
			System.out.printf("%s\t", dto.num);
			System.out.printf("%s\t", dto.dept);
			System.out.printf("%s\t", dto.grade);
			System.out.printf("%s\t", dto.tel);
			System.out.printf("%s\n", dto.addr);

		}
		Line.dLine(100);
		return null;
	}

//	@Override
//	public void printStudent(StudentDto stdDto) {
//
//	}
}
