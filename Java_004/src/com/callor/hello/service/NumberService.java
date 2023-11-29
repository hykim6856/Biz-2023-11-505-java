package com.callor.hello.service;

public class NumberService {

	/*
	 * 두 개의 정수 값을 매개 변수(num1,num2)를 통하여 전달받아
	 * 정수 값을 덧셈한 후 return 하는 method이다.
	 */
	//static 이 없는 메소드 
	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
}
