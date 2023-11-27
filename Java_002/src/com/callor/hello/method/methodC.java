package com.callor.hello.method;

public class methodC {
	public static void main(String[] args) {
		double num1 =0;
		for(int i =0; i<10; i++) {
			num1 =Math.random();
			num1 *= 100;
			int num2 =(int)num1;
			System.out.println(num2+1);
		}
	}

}
