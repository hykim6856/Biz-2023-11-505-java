package com.callor.com;

public class VarD {
	public static void main(String[] args) {
		/*
		 * 정수형 데이터를 보관하기 위한 정수형 변수 선언
		 * 기본적인 변수를 선언하는 명령어는 첫글자가 모두 소문자이다.
		 * 첫글자가 소문자인 명령어로 선언된 변수를 '기본형(primitive)'라고 한다.
		 */
		int num1=0;
		
		/*
		 * 문자열 데이터를 보관하기 위한 문자열 변수 선언 
		 * 다른변수와 달리 String 명령어를 사용하는데 String 명령어는 첫글자가 대문자이다
		 * 첫글자가 대문자인 명령어로 선언된 변수를 '확장형(Type,창조형)'이라 한다.
		 * 
		 * 문자열형(String Type) 변수는 java가 탄생될 당시에는 없던 변수이다. 나중에 필요에 따라 추가된 변수이다.
		 */
		String nation = "대한민국";
		System.out.println(nation);
		
		//변수 이름은 가급적 2개이상의 단어를 조합하는 것이 좋다.
		String stdName ="홍길동";
		String stdDept ="컴퓨터공학";
		/*
		 * 변수의 형 (type)과 보관(저장, 할당)하는 데이터의 관계
		 * 보관하고자 하는 데이터의 type을 확인하고 정확히 일치하는 type으로 선언된 변수에 값을 보관하여야한다.
		 * 문자열형 변수에는 문자열만 보관이 된다.
		 * 숫자를 문자열형 변수에 보관하려면 ""로 묶어주어야한다.
		 * 
		 * 학년을 변수에 저장하고 싶은데 문자열형과 숫자형으로 동시에 만들고 싶다
		 * 이럴때는 변수의 이름은 같게 만들고 prefix로 변수의 type을 지정하는 방법이 있다.=헝가리언 표기법
		 */
		String stdGrade ="3";
		int intStdGrade = 3;
		
		//숫자형 변수 stdNum에 문자열형 데이터 "20231001"은 보관이 안된다.
		//int stdNum = "202311001"
		
	}

}
