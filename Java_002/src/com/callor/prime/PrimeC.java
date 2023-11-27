package com.callor.prime;

public class PrimeC {
	public static void main(String[] args) {
		int num = 9;
		boolean noPrime = false;
		System.out.println("=============================");
		System.out.printf("%d 는 Prime Number 인가?\n", num);
		System.out.println("-----------------------------");
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				noPrime = true;
				break;
			}
		}
		if (noPrime) {
			System.out.printf("%d 는 소수가 아님\n", num);
		} else {
			System.out.printf("%d 는 소수임\n", num);
		}
		System.out.println("=============================");

		// ===================================================

		num = 9;
		noPrime = false;
		System.out.println("=============================");
		System.out.printf("%d 는 Prime Number 인가?\n", num);
		System.out.println("-----------------------------");
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				noPrime = true;
				break;

			}
		}
		if (noPrime) {
			System.out.printf("%d 는 소수가 아님\n", num);
		} else {
			System.out.printf("%d 는 소수임\n", num);
		
		}
		System.out.println("=============================");
	}
}
