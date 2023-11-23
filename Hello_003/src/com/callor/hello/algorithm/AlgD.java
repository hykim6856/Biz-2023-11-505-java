package com.callor.hello.algorithm;

public class AlgD {
	public static void main(String[] args) {
		int num1 = 337;
		int num2 = 333;
		
		boolean bYes = false;
		bYes = num1 % 2 == 0;
		
		if(bYes) {
			System.out.println(num1 + "는 짝수입니다.");
			
		} else {
			System.out.println(num1 + "는 짝수가 아닙니다.");
		}
		
		bYes = num1 % 3 == 0;
		if(bYes) {
			System.out.println(num1 + " 는 3의 배수입니다.");
		} else {
			System.out.println(num1 + " 는 3의 배수가 아닙니다.");
		}
		// 정수 300을 일단 num1 에 할당하고
		// num1에 저장된 값을 복사하여 num2 에 할당하라
		// 결국 num2 와 num1 에는 300이 보관된다.
		num1 = num2 = 300;
	}

}
