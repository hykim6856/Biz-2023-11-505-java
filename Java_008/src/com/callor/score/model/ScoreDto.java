package com.callor.score.model;
//Dto:Data Transfer Object 
//Data를 저장(이동)하기 위한 클래스

//data.txt 파일에 저장된 데이터의 구조
//학번, 국어, 영어, 수학, 음악, 미술, 소프트웨어공학, 데이터베이스
public class ScoreDto {
	
	
		//data.txt 파일에 저장된 데이터의 구조를 변수로 선언
		public String stdnum;
		public int kor;
		public int eng;
		public int math;
		public int music;
		public int art;
		public int sw;
		public int db;
		
		//과목의 총점과 평균을 계산하여 저장할 추가 변수
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
		
		//return 하는 avg 변수의 type 이  float이므로 
		//getAvg()method의 return type도 float여야함.
		public float getAvg() {
			getTotal();
			avg= (float)total /7;
			return avg;
			
			
		}
	
}
