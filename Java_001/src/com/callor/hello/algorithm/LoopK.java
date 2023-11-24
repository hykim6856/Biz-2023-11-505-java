package com.callor.hello.algorithm;

public class LoopK {

	public static void main(String[] args) {
		int sum =0;
		int num =135;
		for(int i=0; i <num ;i++) {
			sum += (i + 1); 
		}
		System.out.println("=====================================");
		System.out.printf("1~ %d 까지 덧셈결과 : %d\n" , num , sum);
		System.out.println("=====================================");
	}
}
