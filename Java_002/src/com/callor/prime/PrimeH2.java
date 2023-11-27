package com.callor.prime;

public class PrimeH2 {
	// 2~100까지의 소수들의 합 : 1060

	public static void main(String[] args) {
		System.out.println("===================================");
		System.out.println("2~100까지의 소수들의 합");
		System.out.println("-----------------------------------");

		int sum = 0; // 합계에요
		for (int index = 1; index < 100; index++) {// 1부터99까지 반복할거에요
			for (int i = 1; i < 100; i++) { // 1부터 99까지 반복할거에요
				if ((i + 1) % (index + 1) == 0) { // i가 소수인가요?
				} else {
					sum += (i + 1);
				}
			}
		}
		System.out.printf("2~ 100 까지의 수 중 소수들의 덧셈 결과 : %d \n", sum);
		System.out.println("===================================");
	}
}
