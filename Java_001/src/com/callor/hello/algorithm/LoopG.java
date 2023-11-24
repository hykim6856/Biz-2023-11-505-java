package com.callor.hello.algorithm;

public class LoopG {

	public static void main(String[] args) {
		for(int i= 0; i< 100 ; i++) {
			System.out.printf("%3d ", i+1);
			//i=1이 10의 배수이면 10번 출력문을 실행
			if((i+1)%10==0) {
				System.out.println();
				//
			}
			
		}
	}
}
