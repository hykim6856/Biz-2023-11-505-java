package com.callor.hello.var;

public class VarD {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 0;

		num1 = 200;
		num1 = 300;
		num1 = 0;
		num1 = -1;
		System.out.println(num1);

		// 변수 num1에 보관중인 값을 복사하여
		// 변수 num2에 보관, 저장, 할당 하라
		num2 = num1;

		// 변수 num1 에 보관된 값을 읽어 오고
		// 정수 100과 덧셈을 연산한 후
		// 변수 num2 에 할당하라
		num2 = num1 + 100;

		/*
		 * 1. 변수 num2에 보관된 값을 읽어서 cpu로 이동 2. 정수 100을 덧셈 3. 덧셈한 최종 결과를 다시 num2 변수에 보관
		 * num2 의 값을 원래 값에 100만큼 증가시키는 효과를 낸다.
		 */
		num2 = num2 + 100;

		num2 = num2 + 1;
		num2 = num2 + 1;
		num2 = num2 + 1;
		num2 = num2 + 1;
		num2 = num2 + 1;
		num2 = num2 + 1;

	}
}
