package com.callor.hello.var;

public class VarC {
	public static void main(String[] args) {

		int scKor = 0;
		int scEng = 0;
		int scMath = 0;
		int total = 0;
		int avg = 0;

		scKor = 80;
		scEng = 75;
		scMath = 90;

		total = scKor + scEng + scMath;
		avg = total / 3;

		System.out.println("============================");
		System.out.println("국어 : " + scKor);
		System.out.println("영어 : " + scEng);
		System.out.println("수학 : " + scMath);
		System.out.println("----------------------------");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("============================");

	}

}
