package com.callor.hello.arrays;

public class ArraysD {
	public static void main(String[] args) {
		// 변수 10개 선언하기
		int[] nums = new int[10];

		// 변수에 임의의 값 할당하기
		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		// 짝수인 변수값 출력하기
		for (int i = 0; i < 10; i++) {
			if (nums[i] % 2 == 0) {
				System.out.printf("index %d 번 요소의 값 : %d \n", i, nums[i]);
			}
		}
		// 짝수들의 값 합산하기
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			if (nums[i] % 2 == 0) {
			sum += nums[i];
			}
		}
		System.out.println("짝수들의 합 : " + sum);
	}
}
