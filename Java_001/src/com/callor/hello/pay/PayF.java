package com.callor.hello.pay;

public class PayF {

	public static void main(String[] args) {
		int pay = 3587960;
		int note = 50000;
		
		System.out.println("======================");
		System.out.println( note+"원권 : " + pay / note);
		pay= pay % note;
		note= note/5;
		System.out.println( note+"원권 : " + pay / note);
		pay= pay % note;
		note= note/2;
		System.out.println( note+"원권 : " + pay / note);
		pay= pay % note;
		note= note/5;
		System.out.println( note+"원권 : " + pay / note);
		pay= pay % note;
		note= note/2;
		System.out.println( note+"원권 : " + pay / note);
		pay= pay % note;
		note= note/5;
		System.out.println( note+"원권 : " + pay / note);
		pay= pay % note;
		note= note/2;
		System.out.println( note+"원권 : " + pay / note);
		pay= pay % note;
		note= note/5;
		System.out.println( note+"원권 : " + pay / note);
		pay= pay % note;
		note= note/2;
		
	
		
		
	}
}
