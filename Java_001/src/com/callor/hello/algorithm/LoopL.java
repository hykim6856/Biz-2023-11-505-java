package com.callor.hello.algorithm;

public class LoopL {

	public static void main(String[] args) {
		int sum = 0;
		for(int i =0; i<100; i++) {
			if((i+1)%2==0) {
				sum +=(i+1);
			}
		}
		System.out.println(sum);
		
		//==================================
		int range = 100;
		sum = 0;
		for(int i =0; i<range; i++) {
			if((i+1)%2==0) {
				sum +=(i+1);
			}
		}
		System.out.printf("0~ %d 까지의 수 중 짝수의 덧셈 결과 : %d" , range, sum);
	}
}
