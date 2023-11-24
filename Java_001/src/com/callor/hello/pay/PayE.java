package com.callor.hello.pay;

public class PayE {

	public static void main(String[] args) {
		int pay = 3587960;
		
		System.out.println("======================");
		System.out.println("5만원권 : " + pay / 50000);
		pay= pay % 50000;
		System.out.println("만원권 : " + pay / 10000);
		pay = pay % 10000;
		System.out.println("5천원권 : " + pay / 5000);
		pay = pay % 5000;
		System.out.println("천원권 : " + pay / 1000);
		pay = pay % 1000;
		System.out.println("5백원권 : " + pay / 500);
		pay = pay % 500;
		System.out.println("백원권 : " + pay / 100);
		pay = pay % 100;
		System.out.println("5십원권 : " + pay / 50);
		pay = pay % 50;
		System.out.println("십원권 : " + pay / 10);
		pay  = pay % 10;
	
		
		
	}
}
