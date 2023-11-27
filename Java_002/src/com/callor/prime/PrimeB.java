package com.callor.prime;

public class PrimeB {
	public static void main(String[] args) {
		int num = 15;
		System.out.println("==================================");
		System.out.printf("%d는 소수 인가? \n", num);
		System.out.println("----------------------------------");
		for (int i = 0; i + 2 < num; i++) {
			if (num % (i + 2) == 0) {
				System.out.printf("%d MD %d = %d, %d 는 소수가 아님\n", num, i + 2, num % (i + 2),num);
			}

		}
		System.out.println("==================================");
	}

}
