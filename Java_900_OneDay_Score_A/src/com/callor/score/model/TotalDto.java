package com.callor.score.model;

public class TotalDto {

	public int kor;
	public int eng;
	public int math;
	public int music;
	public int art;

	private int total;
	private float avg;

	private int 과목수 = 5;

	public int getTotal() {
		total = kor;
		total += eng;
		total += math;
		total += music;
		total += art;
		return total;
	}
	
	public float getAvg () {
		this.getTotal();
		avg = (float)total / 과목수;
		return avg;
	}
	//국어 점수의 평균을 계산하여 return
	public float getKorAvg ( int size) {
		return (float) kor / size;
	}
	public float getEngAvg ( int size) {
		return (float) eng / size;
	}
	public float getMathAvg ( int size) {
		return (float) math / size;
	}
	public float getMusicAvg ( int size) {
		return (float) music / size;
	}
	public float getArtAvg ( int size) {
		return (float) art / size;
	}
	
}
