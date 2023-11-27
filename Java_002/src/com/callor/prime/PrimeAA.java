package com.callor.prime;

public class PrimeAA {
	public static void main(String[] args) {
		/*
		 * 어떤 수가 소수인가를 판별하기 위해 선언한 변수
		 */
		int num = 9;
		System.out.println("==================================");
		System.out.printf("%d는 소수 인가? \n",num);
		System.out.println("----------------------------------");
		for (int i = 0; i + 2 < num; i++) {
			System.out.printf("%d MOD %d = %d\n",num, i + 2,num%(i+2));

		}
		System.out.println("==================================");
	}

}
