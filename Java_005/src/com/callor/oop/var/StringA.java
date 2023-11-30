package com.callor.oop.var;

public class StringA {
	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 30;

		System.out.println(num1 == num2);
		
		String str1 ="대한민국";
		String str2 ="대한민국";
		
		System.out.println(str1 == str2);
		String str3 =new String("우리나라");
		String str4 =new String("우리나라");
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		System.out.println(str3.equalsIgnoreCase(str4));
		
	}
}
