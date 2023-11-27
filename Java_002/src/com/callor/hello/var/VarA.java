package com.callor.hello.var;

public class VarA {

	public static void main(String[] args) {
		int num1 = 0;
		double num2 = 0;
		String str = "";

		// double 형 변수에 int 형 변수 값을 복사하기. ㅈ
		// 자동으로 작동되는 코드
		num2 = num1;
		// int 형 변수에 double 형 변수 값을 복사하기
		// double 형 변수에 저장된 값을 잃어 버릴 수 있기 때문에
		// 자동으로 작동되지 않는다.
		// 강제로 적용해야하는데 변수명 앞에
		// 형(type)이 변환 키워드를 붙인다
		num1 = (int)num2;
		
		//문자열 형 변수에 숫자형 (정수, 실수) 값을 복사하기
		//숫자형 값은 문자열 형 변수에 자동으로 할당하지 못한다.
		//그래서 강제로 숫자를 문자열로 변환 시켜야한다.
		str = num1+"";
		str = num2+"";
		
		String 즐겁다 = "ㅈ됐다.";
		System.out.println(즐겁다);


	}
}
