package com.callor.hello.var;

import com.callor.hello.service.NumberService;

public class VarA {
	public static void main(String[] args) {
		// NumberService 의 add()에게 두개의 정수를 전달하고
		// 결과를 return 받아서 console에 출력하고 싶다.

		// NumberService 클래스에 있는 add 메소드를 사용하려고 하는데
		// add 메소드는 스태틱이 없다
		// 그래서 이 메소드는 넘버 서비스. 애드 처럼 사용할 수 없다.

		// int sum = NumberService.add(1,2);
		// numberService 의 add() method 를 사용하려면 먼저 준비를 해야한다.

		// NumberService 클래스(설계도)를 가지고
		// 객체(Object) 를 새로(new) 만들어줘(NumberService)
		NumberService numberService1 = new NumberService();
		NumberService numberService2 = new NumberService();
		NumberService numberService3 = new NumberService();
		int result = numberService1.add(1, 3);
		
		String nation1 = "대한민국";
		String nation2 = new String("우리나라");
		String nation3 = new String();		
		System.out.println(result);
		System.out.println(nation1);
		System.out.println(nation2);

	}
}
