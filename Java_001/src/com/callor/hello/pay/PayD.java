package com.callor.hello.pay;

public class PayD {

	public static void main(String[] args) {
		int pay = 3587960;
		int note50000 = pay /50000;
		pay = pay % 50000;
		int note10000 = pay /10000;
		pay = pay % 10000;
		int note5000 = pay /5000;
		pay = pay % 5000;
		int note1000 = pay /1000;
		pay = pay % 1000;
		int note500 = pay /500;
		pay = pay % 500;
		int note100 = pay /100;
		pay = pay % 100;
		int note50 = pay /500;
		pay = pay % 50;
		int note10 = pay /10;
		pay = pay % 10;
		
		
		System.out.println("======================");
		System.out.println("5만원권 : " + note50000 / 50000);
		System.out.println("만원권 : " + note10000 / 10000);
		System.out.println("5천원권 : " + note5000 / 5000);
		System.out.println("천원권 : " + note1000 / 1000);
		System.out.println("5백원권 : " + note500 / 500);
		System.out.println("백원권 : " + note100 / 100);
		System.out.println("5십원권 : " + note50 / 50);
		System.out.println("십원권 : " + note10 / 10);
	
		
		
	}
}
