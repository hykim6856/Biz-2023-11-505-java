package com.callor.hello.var;

public class VarCB {
	public static void main(String[] args) {
		//변수를 선언하는 곳
		int scKor = 80;
		int scEng = 75;
		int scMath = 90;
	
		int total = scKor + scEng + scMath;
		int avg = total / 3;
		
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
