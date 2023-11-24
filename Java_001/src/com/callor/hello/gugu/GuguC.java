package com.callor.hello.gugu;

public class GuguC {

	public static void main(String[] args) {
//		int num =2;
//		int index = 1;
	
		for (int num=2 ;num <10;num++) {
		System.out.println("========================");
		System.out.println(num + "단 구구단");
		System.out.println("------------------------");
		for(int index =1;index <10;) {
			System.out.print(num);
			System.out.print(" x ");	
			System.out.print(index);
			System.out.print(" = ");
			System.out.println(num*index++);
			}
		
		}
	}
}