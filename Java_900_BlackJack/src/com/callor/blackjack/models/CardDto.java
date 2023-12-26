package com.callor.blackjack.models;

public class CardDto extends Object {

	public String suit; // 카드 모양
	public String denomiation; // 개별점수

	public int value; // 개별 점수(정수형 점수계산용)

	/*
	 * 클래스를 선언하면 객체를 생성하는 기본 생성자가 자동으로 만들어진다 기본 생성자는 매개변수가 없고 기본적으로 코드도 보이지 않음
	 */

	public CardDto() {

		// TODO Auto-generated constructor stub
	}

	public String getPattern(int index) {
		return this.getPatterns()[index];

	}

	public String[] getPatterns() {
		String[] patterns = { 
				String.format("┌──────────┐"), 
				String.format("│          │"),
				String.format("│   %1s      │", this.suit), 
				String.format("│          │"),
				String.format("│   %2s     │", this.denomiation), 
				String.format("│          │"),
				String.format("└──────────┘") };

		return patterns;
	}

	/*
	 * 자바에서 어떤 클래스(코드)를 만들면 자동으로 extends Object 코드가 부착되고 오브젝트 클래스를 자동으로 상속받는다 오브젝트
	 * 클래스는 여러가지 기본 메서드가 있는데 그 중에 toString 메서드능 클래스를 사용하여 생성된 객체의 시스템 정보를 문자열로 리턴하는
	 * 코드가 만들어져있다.
	 * 
	 * 이 투 스트링 메서드를 재정의하여 다른 용도로 사용하려고 함 보통 Dto 클래스에서는 각 변수들의 값을 문자열로 생성하여 return
	 * 해주는 코드로 만들어 사용한다. 이클립스 에서는 투스트링 메서드를 자동으로 재정리 해주는 기능이 포함되어있다.
	 * 
	 * 
	 * 
	 */

	@Override
	public String toString() {
		return "CardDto [suit=" + suit + ", denomiation=" + denomiation + ", value=" + value + "]";
	}

	/*
	 * 개별 낱장 카드의 정보를 저장할 데이터 클래스 카드이름 카드의 점수지정 변수 포함 클래스
	 * 
	 */

}