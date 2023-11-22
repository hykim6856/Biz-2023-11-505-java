package com.callor.hello.var;

public class VarB {
	public static void main(String[] args) {
		int scoreKor = 0;
		int scoreEng = 0;
		int scoreMath = 0;

		int total = 0;
		int avg = 0;

		// 국어 80, 수학 75, 수학 90점을 각각 변수에 보관
		// 변수에 값을 보관 = 변수에 값 할당 = 변수에 값 대입

		scoreKor = 80;
		scoreEng = 75;
		scoreMath = 90;

		// 3개의 과목 변수에 보관된 값을 모두 덧셈하여 총점을 계산하고 계산된 총점을 total 변수에 할당
		// 변수에 보관된 값을 읽어서 덧셈연산을 수행한 후 또다른 변수에 보관하는 코드
		total = scoreKor + scoreEng + scoreMath;

		// 국어, 영어, 수학 3과목의 총점을 Console에 출력하시오
		System.out.println("총점 : " + total);

		// 3과목의 평균을 계산하여 avg 변수에 할당
		avg = total / 3;

		System.out.println("평균 : " + avg);

	}

}
