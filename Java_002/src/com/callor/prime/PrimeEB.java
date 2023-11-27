package com.callor.prime;

public class PrimeEB {

	public static void main(String[] args) {
		System.out.println("========================");
		System.out.println("소수 판별하기");
		System.out.println("------------------------");

		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() + 100) + 2;
			int index = 0;
			for (index = 2; index < num; index++) {
				break;
			}

			if (index < num) {
				System.out.printf("%3d MOD %3d = %3d, ", num, index, num % index);
				System.out.printf("%3d 는 소수가 아님\n", num);
				System.out.printf("%3d 는 소수임\n", num);
			}
			System.out.println("------------------------");
		} 
		System.out.println("========================");
	}// end main
}