package com.callor.hello.algorithm;

public class AlgF {

	public static void main(String[] args) {
		/*
		 * 우리나라 화폐는 5만, 1만, 5천, 1천, 5백, 1백, 50, 10원 단위이다 
		 * 아래 pay 에 저장된 값에서 각각 화폐단위만큼 최소 몇개씩이 포함되는지 출력하시오
		 */
		// ======================================================================
		// 일단 해보기
		int pay = 3587964;
		System.out.println("오만원   : " + pay / 50000 + " 매");
		pay = pay % 50000;
		System.out.println("만원     : " + pay / 10000 + " 매");
		pay = pay % 10000;
		System.out.println("오천원   : " + pay / 5000 + " 매");
		pay = pay % 5000;
		System.out.println("천원     : " + pay / 1000 + " 매");
		pay = pay % 1000;
		System.out.println("오백원   : " + pay / 500 + " 매");
		pay = pay % 500;
		System.out.println("백원     : " + pay / 100 + " 매");
		pay = pay % 100;
		System.out.println("오십원   : " + pay / 50 + " 매");
		pay = pay % 50;
		System.out.println("십원     : " + pay / 10 + " 매");
		pay = pay % 10;

		// -------------------------------------------------------------------
		// 검산
		System.out.println(71 * 50000 + 3 * 10000 + 1 * 5000 + 2 * 1000 + 1 * 500 + 4 * 100 + 1 * 50 + 1 * 10);

		// ======================================================================
		// 좀 더 간단하게 만들 수 있을지 고민하기
		pay = 3587964;
		System.out.println("오만원   : " + pay / 50000 + " 매");
		System.out.println("만원     : " + (pay = pay % 50000) / 10000 + " 매");
		System.out.println("오천원   : " + (pay = pay % 10000) / 5000 + " 매");
		System.out.println("천원     : " + (pay = pay % 5000) / 1000 + " 매");
		System.out.println("오백원   : " + (pay = pay % 1000) / 500 + " 매");
		System.out.println("백원     : " + (pay = pay % 500) / 100 + " 매");
		System.out.println("오십원   : " + (pay = pay % 100) / 50 + " 매");
		System.out.println("십원     : " + (pay = pay % 50) / 10 + " 매");

	}
}
