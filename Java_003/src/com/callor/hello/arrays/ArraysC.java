package com.callor.hello.arrays;

public class ArraysC {

	public static void main(String[] args) {
		//배열 5개 선언하기(생성하기)
		int[] nums = new int [5];
		//배열에 임의의 값 저장하기
		for(int index = 0; index<5; index ++) {
			nums[index] = (int)(Math.random()*50)+51;
		}
		
		//배열에 저장된 값 출력하여 확인하기
		for(int i = 0 ; i<5 ;i++) {
			System.out.printf("%d 번째 저장된 값 : %d\n", i+1, nums[i]);
		}
		int sum = 0;
		for (int i= 0; i<5 ; i++) {
			sum += nums[i];
		
		}
		System.out.println("합계 : "+sum );
	}
}
