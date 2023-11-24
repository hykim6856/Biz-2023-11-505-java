package com.callor.hello.start;

public class HelloB {
	public static void main(String[] args) {
		/*
		 * num1 이라는 '보관소를 예약'하고 정수 30을 보관
		 * 단, num1 변수(보관소)에는 int type의 정수만 보관하겠다.(=long type의 정수는 보관하지 않겠다)
		 * num2 라는 '보관소를 예약'하고 정수 40을 보관
		 * 단, num2 변수(보관소)에는 int type의 정수만 보관하겠다.(=long type의 정수는 보관하지 않겠다)
		 */ 
		int num1 = 30;
		int num2 = 40;
		// 지금부터 num1 이라고 이름붙여진 곳에 30이라는 수를 보관하겠다 선언.
		// 보관소(numX)는 중복되어선 안됨. 보관소는 자바에서 '변수'라고 불림. (변하는수X. 보관소O)
		// numx라는 보관소는 int타입의 정보만 보관하겠다. '='<-는 같다라는 뜻이아니라 오른쪽의 값을 왼쪽에 저장하겠다는 뜻
		
		
		/*
		 * long type의 num3, num4 변수를 예약하고 각각 정수 30과 40을 보관하라
		 */		
		long num3 = 30;
		long num4 = 40;

		System.out.println(num1+num2+num3+num4);
	}

}
