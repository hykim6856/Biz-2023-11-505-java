package com.callor.hello.start;

public class HelloC {

	// num1, num2변수는 main이 예약한 변수이므로, 자유롭게 어떤 정수이던지 보관이 가능하다.
	public static void main(String[] args) {
		// 변수를 예약하고 clear하기(선언된 변수에는 선언 이후에 값을 보관할 수 있다.)
		int num1 = 0;
		int num2 = 0;

		// 예약된 변수에 실제 사용할 값(정수)을 보관하기(예약한 경우 num앞에 int 명령어를 붙이지 않아도 됨)
		num1 = 30;
		num2 = 40;

		System.out.println(num1 + num2);

		// 이미 값이 보관된 변수에 새로운 값을 보관하기(보관되어있던 30, 40 값은 clear 된다.)
		num1 = 300;
		num2 = 400;

		// 변수 num1과 num2에 보관된 값을 Console에 출력하라
		System.out.println(num1);
		System.out.println(num2);

		// 선언된(예약된) 변수에 보관된 값을 재사용하여 사칙연산과 나머지 연산을 수행하기
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);

	}

}
