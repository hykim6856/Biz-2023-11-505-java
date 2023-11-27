package com.callor.prime;

public class PrimeD {

	public static void main(String[] args) {
		double num1 = 0;
		boolean noP= false;
	
		int index = 0;
		for (int i = 0; i < 10; i++) {
			num1 = Math.random();
			num1 *= 10;
			int num2 = (int) num1;
			System.out.println("=============================");
			System.out.printf("%d 는 소수인가?\n" ,num2 + 1);
			System.out.println("-----------------------------");
			int numR = num2 + 1;
			for (index = 2; index < numR; index++) {
				if (numR % index == 0) {
					break;

				}
				

				}
			if (noP) {
				System.out.printf("%d MOD %d +%d, ", numR, index, numR % index);
				System.out.println(numR + "는 소수가 아님");
			} else {
				System.out.println(numR + "는 소수");
				break;
			}
		}
	}
}

/*
 * 내가 했다가 망한것
	public static void main(String[] args) {

		int num = 0;
		double num1 = 0;
		num1 = Math.random();
		num1 *= 10;
		num = (int) num1;
		boolean noP = false;


		System.out.println("========================");
		System.out.println("------------------------");

		for (int i = 0; i < num; i++) {
			if (num % i == 0) {
				noP = true;
				break;
			}
		}

		if (noP) {
			System.out.printf("%d 는 소수가 아니다.\n", num);
		} else {
			System.out.printf("%d 는 소수임.\n", num);
		}

		System.out.println("========================");
 * 
 */
