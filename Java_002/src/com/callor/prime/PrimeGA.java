package com.callor.prime;

public class PrimeGA {

	public static void main(String[] args) {

		System.out.println("===================================");
		System.out.println("2~100까지의 수 중 소수만 출력하기");
		System.out.println("-----------------------------------");

		for (int i = 2; i < 100; i++) { // 5번동안 아래의 식을 반복해서 진행
			int num = i+1;
			int index = 0;
			for (index = 2; index < num; index++) {
				if ( num% index == 0) {
					break;

				}
			}
			if (index >= i) {
				System.out.printf("%d 는 소수임 \n", i);
			}

		}
		System.out.println("===================================");
	}

}
