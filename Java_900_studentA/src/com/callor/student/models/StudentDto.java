package com.callor.student.models;

//학번,학생이름,학과,학년,전화번호,주소
public class StudentDto {

	// 변수의 순서는 중요하지 않다.
	public String num;
	public String name;
	public String dept;
	public String grade;
	public String tel;
	public String addr;

	// 기본생성자
	public StudentDto() {

	}

	/**
	 * 
	 * @param num학번
	 * @param name이름
	 * @param dept학과
	 * @param grade학년
	 * @param tel전번
	 * @param addr주소
	 */
	// 필드 생성자
	// Student Dto 클래스를 사용하여 객체를 생성할때 모든 맴버 변수를 주입하여 값이 채워진 채로 객채를 만들때 사용하는 생성자.
	public StudentDto(String num, String name, String dept, String grade, String tel, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.dept = dept;
		this.grade = grade;
		this.tel = tel;
		this.addr = addr;
	}

	// toString 재정의 해주기
	@Override
	public String toString() {
		return "StudentDto [num=" + num + ", name=" + name + ", dept=" + dept + ", grade=" + grade + ", tel=" + tel
				+ ", addr=" + addr + "]";
	}

}
