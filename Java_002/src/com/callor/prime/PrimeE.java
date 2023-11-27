package com.callor.prime;

public class PrimeE {

	public static void main(String[] args) {
		int num = 0;
		int index = 0;

		System.out.println("===================================");
		System.out.println("소수 판별하기");
		System.out.println("-----------------------------------");

		for (int i = 0; i < 5; i++) { // 5번동안 아래의 식을 반복해서 진행
			boolean noP = true;
			num = (int) (Math.random() * 100) + 2;// 2부터 101까지의 랜덤한 정수 도출
			for (index = 2; index < num; index++) {
				if (num % index == 0) {
					 noP = true;
					break;

				}
			}
			if (noP) {
				System.out.printf("%d MOD %d = 0, %d 는 소수가 아님 \n", num, index, num);

			} else {
				System.out.printf("%d 는 소수임 \n", num);
			}

		}
		System.out.println("===================================");
	}
}