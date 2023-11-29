package com.callor.hello.arrays;

public class ArraysAA {

	public static void main(String[] args) {
		int[] nums = new int [10];
		for(int index =0 ; index <10; index++) {
			int rndN=(int)(Math.random()*50)+51;
			nums[index]=rndN;
		}
		for(int i = 0; i <10; i++) {
			if(nums[i]>80) {
				System.out.printf("80보다 큰 최초의 값 : index %d = %d",i,nums[i]);
				break;
			}
		}
	}
}
