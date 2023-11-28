package com.callor.hello.arrays;

public class ArraysE {
	public static void main(String[] args) {
		//10개의 정수 마련
		int nums [] =new int [10];
		//각 변수에 51부터 100까지의 임의의 정수 10개 생성하여 할당
		for(int i = 0; i <10 ; i++) {
			nums [i]= (int)(Math.random()*50)+51;
		}
		//nums 배열 요소에 보관된 수 중 80 보다 큰 값을 찾기
		for(int i = 0; i <10 ; i++) {
			if(nums[i]>80) {
				System.out.printf("index %d 번 요소의 값 : %d \n",i,nums[i]);
				break;
			}
		}
	}
}
