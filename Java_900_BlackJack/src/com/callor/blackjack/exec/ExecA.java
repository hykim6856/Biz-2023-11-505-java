package com.callor.blackjack.exec;

import com.callor.blackjack.models.CardDto;

public class ExecA {

	public static void main(String[] args) {
		//디티오 클래스를 사용한 객체의 각 맴버변수에 할당하기
		CardDto cardDto = new CardDto();
		cardDto.suit = "다이아몬드";
		cardDto.denomiation = "A";
		cardDto.value = 1;
		//맴버변수중 suit 에 저장된 값을 읽어서 출력하기
		System.out.println(cardDto.suit);
		
		CardDto cDto = new CardDto();
		cDto.suit="하트";
		
		System.out.println(cardDto.toString());
		System.out.println(cDto.denomiation);
	}
}
