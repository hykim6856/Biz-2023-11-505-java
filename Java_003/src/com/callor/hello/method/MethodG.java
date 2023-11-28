package com.callor.hello.method;

public class MethodG {
	/*
	 * num라는 값을 전달받아서
	 * prime 인지 검사하고 prime 이면 true, 아니면 false 를 return 하겠다는 선언
	 */

	public static boolean isPrime(int num) {
		int i = 0;
		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				break;
			}
		}
		if (i < num) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		int ran = (int) (Math.random() * 100 + 1);
		if (isPrime(ran) == true) {
			System.out.printf("%d : 소수임", ran);
		} else {
			System.out.printf("%d : 소수가 아님", ran);
		}
	}
}
