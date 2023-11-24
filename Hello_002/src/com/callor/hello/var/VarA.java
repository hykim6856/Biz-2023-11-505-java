package com.callor.hello.var;

public class VarA {
	public static void main(String[] args) {
		// 정수형 변수 num1을 선언하고 0으로 clear
		int num1 = 0;
		int num2 = 0;

		int sum = 0;

		/*
		 * 변수 만들기 
		 * 1. 변수에 어떤 데이터를 보관할 것인가 정하기 
		 * 2. 변수에 보관할 데이터가 어떤 type인가 살펴보기 
		 * 3. 보관할 테이터 type의 키워드 확인(int, long) 
		 * 4. 변수 이름짓기 
		 * 가. 가급적 2개 이상의 단어를 조합하여 변수에 어떤 데이터가 담기고, 어떤 일에 쓰일지 이름만 보고 알 수 있도록 만든다. 
		 * 나. 첫글자는 반드시 영문소문자 
		 * 다. 두개 이상의 단어를 조합할때는 두번째 부터 각 단어의 첫글자는 대문자, 나머지는 소문자로 쓴다.(Camel case라고 함) 
		 * 라. 비슷한 유형의 변수가 있을때는 영문자 + 숫자 조합 (ex.num1,num2)
		 */
		int intKor = 0;
		int intEng = 0;
		int intTotal = 0;

		int scpreKor = 0;
		int scoreEng = 0;
		int scoreMath = 0;
		int scoreMusic = 0;
		int scoreArt = 0;
		System.out.println(num1+num2);
		System.out.println(sum+intKor+intEng+intTotal+scpreKor+scoreEng+scoreMath+scoreMusic+scoreArt);
	}
}
