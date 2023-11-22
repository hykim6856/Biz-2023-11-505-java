package com.callor.hello.var;

public class VarCC {
	public static void main(String[] args) {
		//변수를 선언하는 곳
		int scKor = 0;
		int scEng = 0;
		int scMath = 0;
		int total = 0;
		int avg = 0;
		
		
		//출력하는 부분
		System.out.println("=====================");
		System.out.println("성적표");
		System.out.println("=====================");
		scKor = 80;
		System.out.println("국어 : " + scKor);
		scEng = 75;
		System.out.println("영어 : " + scEng);
		scMath = 90;
		System.out.println("수학 : " + scMath);
		System.out.println("---------------------");
		total = scKor + scEng + scMath;
		System.out.println("총점 : " + total);
		avg = total / 3;
		System.out.println("평균 : " + avg);
		System.out.println("=====================");
		
		
		
		
	}

}
