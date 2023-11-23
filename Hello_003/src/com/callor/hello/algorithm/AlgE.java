package com.callor.hello.algorithm;

public class AlgE {

	public static void main(String[] args) {
		/*
		 * 아래의 num1 변수에 저장된 숫자의 10만 단위의 값이 얼마인지 출력하시오.
		 */
		int num1 = 3587964;
		int tenTNum = (num1 / 100000) % 10;
		System.out.println("10만 단위의 값 : " + tenTNum);
		//================================================
		num1 = 3587964;
		tenTNum = (num1 % 1000000) / 100000;
		System.out.println("10만 단위의 값 : " + tenTNum);
		//================================================
		num1 = 3587964;
		System.out.println((num1/100000)%10);

	}
}
