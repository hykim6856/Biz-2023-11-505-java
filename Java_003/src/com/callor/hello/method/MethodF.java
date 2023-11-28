package com.callor.hello.method;

public class MethodF {

	public static int add(int num1, int num2) {
		int sum = num1 +num2;
		return sum;
	}
	public static void main(String[] args) {
		int scoreA = 90;
		int scoreB = 80;
		int result =add (scoreA, scoreB);
		System.out.printf("국어%d, 영어 %d, 총점 : %d \n", scoreA, scoreB, result);
	}
}
