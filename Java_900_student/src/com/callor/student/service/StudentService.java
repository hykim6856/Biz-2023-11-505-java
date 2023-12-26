package com.callor.student.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;
import com.callor.student.utils.Line;

public class StudentService {
	Scanner scan = null;
	List<StudentDto> students = null;
	String dataFile = null;

	public StudentService() {
		students = new ArrayList<StudentDto>();

		dataFile = "src/com/callor/student/models/student.txt";
		InputStream is = null;

		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}
		scan = new Scanner(is);

	}

	public void StudentList() {
		while (scan.hasNext()) {
			String line = scan.nextLine();
			StudentDto studentDto = new StudentDto();
			try {
				String[] lines = line.split(",");
				studentDto.name = lines[1];
				studentDto.dept = lines[2];
				studentDto.grade = lines[3];
				studentDto.tel = lines[4];
				studentDto.addr = lines[5];

			} catch (Exception e) {

			}

			students.add(studentDto);

		}
	}

	public void findStudent() {

		this.StudentList();
		scan = new Scanner(System.in);

		while (true) {
			Line.dLine(50);
			System.out.println("학생 이름을 입력하세요(QUIT종료)");
			Line.sLine(50);

			System.out.print("이름 >> ");
			String str = scan.nextLine();
			if (str.equalsIgnoreCase("QUIT"))
				break;

			int i = 0;

			for (StudentDto dto : students) {
				if (str.equals(dto.name)) {
					Line.dLine(50);
					System.out.printf("이름 : %s\n", dto.name);
					System.out.printf("학과 : %s\n", dto.dept);
					System.out.printf("학년 : %s\n", dto.grade);
					System.out.printf("주소 : %s\n", dto.addr);
					System.out.printf("전화번호 : %s\n", dto.tel);
					Line.dLine(50);
					break;
				}
				i++;
			}
			if (i == students.size()) {
				Line.sLine(50);
				System.out.println("* 데이터가 없습니다.");
				Line.dLine(50);
				System.out.printf("%s 자료가 없습니다.\n", str);
				Line.dLine(50);
			}
		}
		System.out.println("종료ㄴ");
	}
}
