package com.callor.oop.service;

public class ScoreService {
	
	//클래스 영역에 선언한 변수
	public String stdNumber = null;
	public int scoreKor = 0;
	public int scoreEng = 0;
	public int scoreMath = 0;

	/*
	 * 스코어 서비스 클래스에
	 * 겟 스코어토탈, 겟스코어평균 메소드를 선언하고 
	 * 총점과 평균을 각각계산하여 리턴하도록 하고있다.
	 * 스코어 토탈 변수와, 스코어 에버리지 변수는 
	 * 총점과 평규능ㄹ 계산하는 용도로 사용중이다.
	 * 스코어 서비스 객체를 통하여 총점과 평균을 참조 하기 위해서는 
	 * 겟 스코어 토탈, 겟 스코어 에버리지메소드를 통해서만 가능해야한다.
	 * 스코어 토틸, 스코어 에버리지 젼수에서 직접 값을 참조(읽기) 하면 엉뚱한 데이터를 참조할 수 있다.
	 * 이때 다른 곳에서 변수를 참조하지 못하도록 하기 위하여
	 * 변수에 프라이빗 키워드를 부착한다.
	 * 
	 * 
	 * 프라이빗 키워드는 현재 클래스 내에서만 값을 할당, 읽기가 가능하도록 제한하는 것이다.
	 */
	private int scoreTotal = 0;
	private float scoreAvg = 0.0f;
	
	
	//정수값을 return 하는 method
	public int getScoreTotal() {
		scoreTotal = scoreKor;
		scoreTotal += scoreEng;
		scoreTotal +=scoreMath;
		return scoreTotal;
		
	}
	public float getScoreAvg() {
		scoreAvg= (float)(scoreTotal)/3;
		return scoreAvg;
	}
}
