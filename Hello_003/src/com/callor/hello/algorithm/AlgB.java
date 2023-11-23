package com.callor.hello.algorithm;

public class AlgB {
	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 40;
		
		boolean bYes = false;
		
		bYes = num1 == num2; //1 과 2의 값이 같냐?
		bYes = num1 >= num2; //2 보다 1이 크거나 같냐?
		bYes = num1 <= num2; //2 보다 1이 작거나 같냐?
		bYes = num1 != num2; //2 과 2의 값이 다르냐?
		
		bYes = num1 > num2;
		bYes = num1 < num2;
		
		
		num1 = 30;
		num2 = 30;
		
		bYes = num1 == num2; //참 
		bYes = num1 >= num2; //참
		bYes = num1 <= num2; //참
		bYes = num1 != num2; //거짓
		
		bYes = num1 > num2; //거짓
		bYes = num1 < num2; //거짓
		
	}

}
