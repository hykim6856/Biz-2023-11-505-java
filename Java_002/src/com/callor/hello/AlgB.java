package com.callor.hello;

public class AlgB {

	public static void main(String[] args) {
		int sum3 = 0;
		int sum5 = 0;
		//1~100 의 수중 3의 배수의 합과 5의 배수의 합
		for (int i = 1; i <= 100; i++) {
			int num = i+1;
			if ((i + 1) % 3 == 0) {
				sum3 += num;
			}//조건 1 3의 배수 구하기
			if ((i + 1) % 5 == 0) {
				sum5 += num;
			}//조건 2 5의 배수 구하기
		}
		System.out.printf("%d + %d= %d \n",sum3,sum5, (sum3 + sum5));
		System.out.printf("%d - %d= %d \n", sum3,sum5,(sum3 - sum5));
		System.out.printf("%d * %d= %d \n",sum3,sum5, (sum3 * sum5));
		System.out.printf("%d / %d= %d \n", sum3,sum5,(sum3 / sum5));
	}
}
