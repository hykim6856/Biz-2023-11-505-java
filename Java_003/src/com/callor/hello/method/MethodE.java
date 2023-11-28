package com.callor.hello.method;

public class MethodE {
/*
	public static int buy()	{
		int money = 2000;
		//int 컵라면 = 1500;
		//int 거스름돈 = 동생-컵라면;
		return money;
	}
	public static void main(String[] args) {
		int buy = buy();
		int price = 1500;
		int change = buy-price;
		System.out.printf("동생은 %d 원을 받고 편의점에서 %d원 짜리 컵라면을 산 후 거스름돈 %d원을 받았다.", buy, price,change);
		*/
	//
	public static int buy(int money)	{ //buy 괄호 안에 매개 변수
//		int money = 2000;
		int cup =1500;
		int change = money - cup;
		return change;
	}
	public static void main(String[] args) {
		int myMoney= 2000;
		int change = buy(myMoney);
		System.out.printf("전달한 값 : %d, 잔액 : %d\n", myMoney, change);
	}
}
