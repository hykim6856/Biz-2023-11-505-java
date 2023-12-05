package com.callor.score.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.StudentDto;
import com.callor.score.utils.Line;

public class StudentService {

	private Scanner scan = null;
	private List<StudentDto> students = null;
	
	//매개변수로 데이터 파일 넣어놨으니까 잊지 않고 확인하기!
	public StudentService(String dataFile) {
		InputStream is = null;
		try {
			is = new FileInputStream(dataFile);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		scan = new Scanner(is);
		students = new ArrayList<>();
	}//end 생성자

	public void loadStudents() {
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] lines = line.split(",");
			StudentDto studentDto = new StudentDto();
			try {
				studentDto.stdNum = lines[0];
				studentDto.name = lines[1];
				studentDto.dept = lines[2];
				studentDto.grade =lines[3];
				studentDto.prof = lines[4];
				studentDto.tel = lines[5];
				studentDto.adds = lines[6];
				
			} catch (Exception e) {
				System.out.println("데이터 읽는 중 오류 발생");
				System.out.println(line);
				break;
			}
			students.add(studentDto);
		} // while
	}// 로드 스코어스

	
	
	 public void countStudent() {
		System.out.println(students.size());
	}
	public void printStudent() {
		Line.dLine(100);
		System.out.println("학번\t이름\t학과\t학년\t담임교수\t전화번호\t주소");
		Line.dLine(100);
		for(int i = 0 ; i < students.size();i++) {
			StudentDto studentDto = students.get(i);
			
			
			System.out.printf("%s\t", students.get(i).stdNum);
			System.out.printf("%s\t", students.get(i).name);
			System.out.printf("%s\t", students.get(i).dept);
			System.out.printf("%s\t", students.get(i).grade);
			System.out.printf("%s\t", students.get(i).prof);
			System.out.printf("%s\t", students.get(i).tel);
			System.out.printf("%s\t\n", students.get(i).adds);

		}
		
	}

	
	
	
	
}//end class
