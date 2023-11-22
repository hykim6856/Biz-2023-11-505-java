package com.callor.hello.var;

public class VarCA {
	public static void main(String[] args) {
		//변수를 선언하는 곳
		int scKor = 0;
		int scEng = 0;
		int scMath = 0;
		int total = 0;
		int avg = 0;
		
		//데이터를 변수에 할당하는 곳
		scKor = 80;
		scEng = 75;
		scMath = 90;

		//계산하는 부분
		total = scKor + scEng + scMath;
		avg = total / 3;
		
		//출력하는 부분
		System.out.println("=====================");
		System.out.println("성적표");
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
