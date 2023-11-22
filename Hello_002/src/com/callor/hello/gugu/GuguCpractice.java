package com.callor.hello.gugu;

public class GuguCpractice {
	public static void main(String[] args) {

		// 정수형 변수 num1 예약하기
		// num1 변수에 값 7 보관하기

		// 정수형 변수 num1을 선언하고
		// 정수 7로 초기화 하기
		int num1 = 7;
		int index = 1;

		System.out.println("====================");
		System.out.println(num1 + "단 구구단");
		System.out.println("--------------------");

		for (int i = 0; i < 9; i++) {
			System.out.print(num1);
			System.out.print(" x ");
			System.out.print(index);
			System.out.print(" = ");
			System.out.println(num1 * index);
			index = index + 1;
		}
		System.out.println("====================");
	}
}
