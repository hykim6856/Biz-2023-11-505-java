package com.callor.student.exec;

public class StringEmpty {
	public static void main(String[] args) {

		String str1 = null;
		String str2 = "";
		String str3 = " ";

		if (str1 == null) {
			System.out.println(str1);
		} else {// String type 의 변수가 null일때는 어떠한 변수도 쓸 수 없다.
			str1.substring(0, 0);
		}
		System.out.println(str2.isBlank());
		System.out.println(str2.isEmpty());
		/*
		 * 문자열. isEmpty()는 ""일 경우 true이고 따옴표 사이에 빈칸 등 어떤 문자열이 있어도 값이 있다고 봐서 flase가 된다.
		 * 
		 *     문자열.isBlank()는 ""," " 은 true
		 *     "가","A"등은 모두 false
		 */
		System.out.println(str3.isBlank());
		System.out.println(str3.isEmpty());
	}
}
