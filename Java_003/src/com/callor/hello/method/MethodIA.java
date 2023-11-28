package com.callor.hello.method;

public class MethodIA {

	/*
	 * num값을 매개변수를 통해 전달받아 소수인지 검사
	 * 소수이면 자신 (num)을 return 아니면 0을 return
	 */
	public static int isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return 0;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("===========================");
		System.out.println("소수 합 구하기");
		System.out.println("---------------------------");
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 100) + 2;
			int isPrime = isPrime(num);
			if (isPrime > 0) {
				System.out.println(isPrime+ " 는 소수임");
				sum += isPrime(num);
			
			}else {
				System.out.println(num+" 는 소수가 아님");
				
			}
			
		}
		System.out.println("---------------------------");
		System.out.println("소수의 합 " + sum);
		System.out.println("===========================");
	}
}
