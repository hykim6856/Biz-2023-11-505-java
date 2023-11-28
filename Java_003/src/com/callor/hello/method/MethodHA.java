package com.callor.hello.method;

public class MethodHA {
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
		System.out.println("===============================");
		System.out.println("소수판별하기");
		System.out.println("-------------------------------");
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 100 + 2);
			boolean isPrime = isPrime(num);
			if (isPrime) {
				System.out.printf("%3d 는 소수임 \n", num);
			} else {
				System.out.printf("%3d MOD %3d = 0, ", num, i);
				System.out.printf("%3d 는 소수가 아님 \n", num);
			}
		}
		System.out.println("===============================");
	}
}