package com.callor.hello.method;

public class MethodGC {

	public static boolean isPrime(int num) {
		int i = 0;
		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int num = (int) (Math.random() * 100) + 2;
		boolean isPrime = isPrime(num);
		if (isPrime) {
			System.out.println(num + ", 소수임");
		} else {
			System.out.println(num + ", 소수가 아님");
		}
	}
}
