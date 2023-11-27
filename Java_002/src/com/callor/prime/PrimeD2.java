package com.callor.prime;

public class PrimeD2 {
	public static void main(String[] args) {

		int num = (int) (Math.random() * 10) + 2;
		int index = 0;
		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				break;
			}
		}
		if (index < num) {
			System.out.printf("%d MOD %d = 0, %d 는 소수가 아님 \n", num, index, num);

		} else {
			System.out.printf("%d 는 소수임 \n", num);
		}
	}
}
