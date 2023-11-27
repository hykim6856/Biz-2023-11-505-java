package com.callor.hello;

public class AlgA {

	public static void main(String[] args) {
		/*
		 * 1~100까지 숫자중의 3의 배수의 합
		 */
		int sum3 = 0;
		for (int i = 1; i <= 100; i++) {
			if ((i + 1) % 3 == 0) {
				sum3 += (i + 1);
				//num 의 값이 3의 배수인 경우에만 실행되는 코드
			}
		}
		System.out.println(sum3);
	}
}
