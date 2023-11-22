package com.callor.hello.var;

public class VarF {
	public static void main(String[] args) {
		// 변수를 선언하는 곳
		float scKor = 0.0f;
		float scEng = 0.0f;
		float scMath = 0.0f;
		float total = 0.0f;
		float avg = 0.0f;

	
		scKor = 80.2f;
		scEng = 70.3f;
		scMath = 80.3f;

		total = scKor + scEng + scMath;
		avg = total / 3;

		System.out.println("=====================");
		System.out.println("국어 : " + scKor);
		System.out.println("영어 : " + scEng);
		System.out.println("수학 : " + scMath);
		System.out.println("---------------------");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("=====================");
	}
}

