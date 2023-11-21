package com.callor.hello;

public class HelloE {
	public static void main(String[] args) {
		/*
		 * 문자열 출력
		 * DQ(큰 따옴표)로 묶인 것들은 모두 문자열 이라고 한다.
		 * 문자열은 보이는 그대로가 값이다.
		 * 문자열을 출력하면 보이는 그대로 출력된다.
		 * "30+40"을 출력하면 30+40 이 출력된다.
		 * 문자열은 '+'(연결연산자)만 가능하다
		 * 문자열 + 문자열 연산은 문자열을 하나로 연결하는 결과가 나타난다.
		 * 문자열 + 연산 식에 숫자가 포함되면 연산을 수행하기 전에 모든 수를 문자열로 먼저 변환한다.
		 */
		System.out.println("Korea");
		System.out.println("30 + 40");
		System.out.println("30" + "40"); //문자열 연결 덧셈. 뺄셈은 불가.
		System.out.println(30 + "40"); //정수+문자 연산 전에 숫자를 문자로 바꿈
		System.out.println("40" + 30); //문자열이 포함되어있으면, 문자열로 변한다.

	}
}
