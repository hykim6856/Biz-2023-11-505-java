package com.callor.hello.method;

public class methodA {
	public static int num() {
		return 100;
	}

	public static int num(int arg) {
		return 100 + arg;
	}

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;

		num1 = 30 + 40;
		num2 = num1 + 50;
		num1 += 100;
		/*
		 * 1. 현재 java 파일 (MethodA.java)에 
		 * num() {} 라는 method가 있는지 찾기
		 * 2. 있으면 num() method를 "호출하기"
		 * 3. num()라는 method가 return(결과) 한 값을 
		 * 4. num1 변수에 할당하라.
		 */
		
		num1 = num();
		/*
		 * 1. 현재 java파일에 num (정수형 변수){}라는 method가 있는지 찾기
		 * 2. 있으면 정수 20을 전달하면서 num (정수형변수) method를 "호출하기"
		 * 3. num (정수형 변수)라는 method가 return(결과)한 값을 
		 * 4. num2 변수에 할당하라
		 */
		num2 = num(20);

		System.out.println(num1);
		System.out.println(num2);
	}
}
