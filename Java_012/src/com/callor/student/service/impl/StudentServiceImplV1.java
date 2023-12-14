package com.callor.student.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StIndex;
import com.callor.student.models.StudentDto;
import com.callor.student.service.StudentService;
import com.callor.student.ultils.Line;

/*
 *    StudentServiceImpV1 클래스는 StudentService interface 를 
 *    implements(상속, 설계를 이어받기)하였다.
 *    이때 interface 에 정의된 method 들은 반드시 만들어야한다.
 *    그렇지 않으면 코드가 오류가 발생하여 진행이 되지 않는다.
 * 
 *    interface 와 class간에 하나의 규칙이 만들어지는 것이다.
 * 
 *    이렇게 interface를 implements 한 클래스를 "구현체" 클래스라고 한다.
 */
public class StudentServiceImplV1 implements StudentService {

	// 현재 Impl 클래스를 다른 클래스가 상속하였을때 protected 로 선언된 변수는 같이 상속이된다.
	// 즉 Implv1을 상속한 클래스에서는 별도로 students 리스트 객체(변수를)선언하지 않아도된다.
	protected List<StudentDto> students = null;
	protected Scanner keyBD = null;

	public StudentServiceImplV1() {
		students = new ArrayList<StudentDto>();
		keyBD = new Scanner(System.in);
	}

	// 학번을 매개 변수로 전달받아 students 리스트를 검색하여 동일한 학번의 요소가 있으면 그 요소를 return
	// 없으면 null을 return
	protected StudentDto selctStdNum(String num) {
		// TODO: 학생정보 찾기
		for (StudentDto std : students) {
			if (std.stdNum.equals(num)) {
				return std;
			}
		}
		// 여기에 코드가 도달하면 같은 학번이 없다.
		return null;
	}

	protected String newStdNum() {
		String stdNum = "S0001";
		if (!students.isEmpty()) {
			stdNum = students.get(students.size() - 1).stdNum;
		}

		return stdNum;
	}

	@Override
	public boolean inputStudent() {
		// TODO: 한 학생의 정보 입력 받기

		// 키보드로 학생의 개별 정보들 (학번, 이름 등) 을 입력받고 임시로 저장할 배열.
		// StdIndex enum 에 선언된 요소의 개수를 세어서 그 개수를 사용하여 inputStr배열을 생성하
		String[] inputStr = new String[StIndex.values().length];
		for (StIndex item : StIndex.values()) {
			while (true) {

				System.out.print(" 입력 (QUIT:종료)>>");
				String str = keyBD.nextLine();
				System.out.printf("%s ", item);

				String newStdnum = this.newStdNum();
				if (item.toString().equals("학번")) {
					if (str.isBlank()) {
						System.out.printf("**학번은%s 를 사용함 \n", newStdnum);

					}
//				System.out.printf("%s 입력 >>", item);
//				String str = keyBD.nextLine();
					if (str.equals("QUIT"))
						return false;
					// 학번을 입력하는 경우 학번의 검사를 실시합니다.
					if (item.toString().equals("학번")) {
						if (str.isBlank()) {
							System.out.printf("**학번은 %s 를 사용함\n", "S0001");
						}

						if (this.selctStdNum(str) != null) {

							System.out.println("학번중복");
							continue;
						}
					} else if (str.isBlank()) {
						System.out.println("값을 입력해주세요");
						System.out.printf("%s 는 필수항목입니다. \n", item);
					}
					// inputStr[item.getIndex()] = keyBD.nextLine();
					// System.out.println();
					// System.out.println(item + " : " + str);
					inputStr[item.getIndex()] = str;

					break;
				}
			}
			StudentDto stDto = new StudentDto();
			stDto.stdNum = inputStr[StIndex.학번.getIndex()];
			stDto.stdName = inputStr[StIndex.이름.getIndex()];
			stDto.stdDept = inputStr[StIndex.학과.getIndex()];
			stDto.stdGrade = inputStr[StIndex.학년.getIndex()];
			stDto.stdTel = inputStr[StIndex.전화번호.getIndex()];
			stDto.stdAddr = inputStr[StIndex.주소.getIndex()];
			students.add(stDto);

			return true;
		}
		return false;
	}

	@Override
	public void inputStudents() {
		// TODO:여러 학생정보 입력받기

		boolean result = true;
		while (result) {
			Line.sLine(50);
			result = this.inputStudent();
			Line.sLine(50);
		}
		System.out.println("입력 끝");
	}

	@Override
	public void loadStudents() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printStudent() {
		// TODO: 학생정보 출력하기

		Line.dLine(90);
		System.out.println("한울고교 학생정보");
		Line.dLine(90);
		System.out.println("학번\t이름\t학과\t학년\t전화번호\t주소\n");
		Line.sLine(90);
		for (StudentDto dto : students) {
			System.out.printf("%s\t", dto.stdNum);
			System.out.printf("%s\t", dto.stdName);
			System.out.printf("%s\t", dto.stdDept);
			System.out.printf("%s\t", dto.stdGrade);
			System.out.printf("%s\t", dto.stdTel);
			System.out.printf("%s\t\n", dto.stdAddr);

		}

	}

	@Override
	public void saveStudent() {
		// TODO Auto-generated method stub

	}

}
