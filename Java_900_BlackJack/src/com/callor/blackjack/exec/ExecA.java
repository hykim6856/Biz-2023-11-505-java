package com.callor.blackjack.exec;

import com.callor.blackjack.models.CardDto;

public class ExecA {

	public static void main(String[] args) {
		CardDto cardDto = new CardDto();

		//cardDto 클래스를 사용한 카드 디토 객체의 각 맴버변수에 값 할당
		cardDto.suit ="다이아몬드";
		cardDto.denomiation ="A";
		cardDto.value =1;


		//멤버변수 중 suit 에 저장된 값을 읽어서 consloe 출력하기
		System.out.println(cardDto.suit);

		CardDto cDto = new CardDto();
		cDto.suit = "하트";

		System.out.println(cardDto.toString());
		System.out.println(cDto.toString());
	}

}