package com.callor.hello.algorithm;
/*
 * 알고리즘
 * 1. 컴퓨터 코딩을 통하여 문제 해결을 하는 것 
 * 2. 어떤 방법으로 문제 해결을 하는 것이 효율적인가
 */

public class AlgA {
	public static void main(String[] args) {
		int num1 = 333;
		int result = 0;
		
		// 어떤 수 (num1에 저장된 값)을 2로 나눈 나머지
		result = num1 %2;
		/*
		 * 컴퓨터 코딩에서 한개의 EQ(==) 할당 연산자이다.
		 * - 오른쪽의 값을 왼쪽의 변수에 할당하기
		 * 두개의 EQ(==)는 비교(관계) 연산자이다
		 * 좌, 우의 값이 같냐? 라는 물음이다.
		 * - 결과는 true 이거나 false라는 값으로 나타난다.
		 */
		System.out.println(num1 + "는 짝수? " +( result == 0));
		System.out.println(num1 + "는 홀수? " + (result == 1));
	}
	
	

}
