package com.callor.score.model;

/*
 * 객체지향의 추상화 하기
 * 프로젝트에서 사용하는 데이터를 묶음으로 취급하기 위한
 * 클래스 선언
 * 
 * 성적 처리를 하기 위한 데이터 묶음 : 
 * 		Data class 라고 하며
 * 		Java 에서는 Dto 라는 접미사를 부착하여
 * 		클래스를 만든다
 * 성적처리 개별 데이터에 맞는 맴버변수 선언하기
 * 
 * 성적처리를 하기 위하여 추상화 해 놓은 데이터는
 * 학번, 국어, 영어, 수학, 음악, 미술, SW공학, DB 이다
 * 또한 이 데이터를 사용하여 
 * 		총점, 평균을 추가 데이터로 한다
 * 
 * 총점과 평균은 기본 데이터의 과목점수를 사용하여
 * 자동 계상하도록 할 것이다
 * 
 */
public class ScoreDto {
	
	//성적 처리를 위한 개별 데이터를 저장할 변수 선언
	public String stdNum;
	
	public int kor;
	public int eng;
	public int math;
	public int music;
	public int art;
	public int sw;
	public int db;
	
	private int total;
	private float avg;
	
	public int getTotal() {
		total = kor;
		total += eng;
		total += math;
		total += music;
		total += art;
		total += sw;
		total += db;
		return total;
	}
	
	public float getAvg() {
		getTotal();
		avg = (float)total / 7;
		return avg;
	}
}	
