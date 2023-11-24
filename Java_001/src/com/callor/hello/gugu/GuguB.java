package com.callor.hello.gugu;

public class GuguB {

	public static void main(String[] args) {
		int num =7;
		int index = 1;
		
		for(;index <10;) {
			System.out.print(num);
			System.out.print(" x ");	
			System.out.print(index);
			System.out.print(" = ");
			System.out.println(num*index++);
			
			
		}
		System.out.println("========================");
		num = 8;
		for(index =1;index <10;) {
			System.out.print(num);
			System.out.print(" x ");	
			System.out.print(index);
			System.out.print(" = ");
			System.out.println(num*index++);
		}
	}
}