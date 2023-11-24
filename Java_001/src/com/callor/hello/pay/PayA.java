package com.callor.hello.pay;

public class PayA {
	public static void main(String[] args) {
		/*
		 * 다음 pay 변수에 저장된 정수는 어떤 사람의 급여이다
		 * 급여를 현금으로 지급하려고한다.
		 * 현금으로 급여를 지급할때는 최소한의 화폐매수를 계산하여 
		 * 지급하는 것이 유리하다
		 * 
		 * 대한민국 화폐는 5만원~10원까지 있다(1원, 5원은 제외)
		 * pay 변수에 저장된 값을 최소 화폐단위를 적용한 급여내역으로 출력하기
		 */
		
		int pay = 3587960;
		System.out.println("5만원권" + pay / 50000 + "매");
		System.out.println("1만원권" + (pay = pay % 50000) / 10000 + "매");
		System.out.println("5천원권" + (pay = pay % 10000) / 5000 + "매");
		System.out.println("1천원권" + (pay = pay % 5000) / 1000 + "매");
		System.out.println("5백원권" + (pay = pay % 1000) / 500 + "매");
		System.out.println("1백원권" + (pay = pay % 500) / 100 + "매");
		System.out.println("5십원권" + (pay = pay % 100) / 50 + "매");
		System.out.println("1십원권" + (pay = pay % 50) / 10 + "매");
		
		
	}

}
