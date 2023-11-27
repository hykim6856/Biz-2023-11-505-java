package com.callor.prime;

public class PrimeA {
	public static void main(String[] args) {
		int num = 9;
		System.out.println("==================================");
		System.out.printf("%d는 소수 인가? \n",num);
		System.out.println("----------------------------------");
		for (int i = 0; i + 2 < num; i++) {
			System.out.printf("%d MOD %d = ",num, i + 2);
			System.out.println(num % (i + 2));

		}
		System.out.println("==================================");
	}

}
