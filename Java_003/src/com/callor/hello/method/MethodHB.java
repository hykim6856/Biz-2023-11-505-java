package com.callor.hello.method;

public class MethodHB {
	/*
	 * 정수 1개를 매개 변수를 통하여 전달받고
	 * 정수가 prime인지 검사한다.
	 * 만약 prime 이면 정수 0을 return하고 
	 * 아니면 index 값을 return한다.
	 */
	public static int isPrime(int num) {
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				return index+2;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("===============================");
		System.out.println("소수판별하기");
		System.out.println("-------------------------------");
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 100) + 2;
			int index = isPrime(num);
			if (index > 0) {
				System.out.printf("%d MOD %d = 0, ", num, i);
				System.out.printf("%d 는 소수가 아님 \n", num);
			} else {
				System.out.printf("%d 는 소수임 \n", num);
			}
		}
		System.out.println("===============================");
	}
}