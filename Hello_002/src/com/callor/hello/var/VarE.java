package com.callor.hello.var;

/*
 * java에서 숫자는 크게 정수와 실수로 구분한다.
 * 정수는 소숫점이하 값이 없는 수
 * 실수는 소수점이하 값이 있는 수
 */
public class VarE {
	public static void main(String[] args) {

		int num1 = 3;
		int num2 = 2;
		// 정수와 정수의 나눗셈 결과는 몫을 구한다.
		System.out.println(num1 / num2);

		/*
		 * 자바에서 숫자는 정수와 실수로 구분을 하는데 각각 정수와 실수는 
		 * 큰 정수(long), 기본정수(int), 
		 * 큰 실수 (double), 작은실수(flat)로 구분한다
		 * 
		 * 숫자의 크고 작음에 따라 기억장소에 보관하는 방법이 다르고, 정밀도가 다르다. 
		 * 같은 정수 실수 끼리도 서로 바꿔서 사용하기 다소 어렵다
		 * 
		 * 정수는 기본이 int 이기에 일반적으로 자유롭게 사용할 수 있지만 실수는 기본이 double 이다. 
		 * 그래서 만약 소수점이 부착된 숫자를 float 로 사용하려면 숫자 뒤에 f 문자를 붙여줘야한다.
		 */
		float num3 = 1.0f;
		float num4 = 3.0f;

		//float 숫자를 연산하면 소수점이하 9자리 부터 오차가 발생한다.
		System.out.println(num3 / num4);
		
		double num5 = 1.0;
		double num6 = 3.0;
		// double 실수 연산은 결과가 소수점 이하 13자리 부터 오차가 발생한다.
		System.out.println(num5 / num6);
	}

}
