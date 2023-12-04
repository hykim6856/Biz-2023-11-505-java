package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;

public class ScoreA {

	public static void main(String[] args) {
		//ScoreService 클래스를 사용하여
		//철수상작, 영희성적, 민수성적이라는 '객체'를 선언했다.
		//일종의 변수를 선언한 것이다.
		//각각의 객체를 생성자(new) method를 사용하여 
		//초기화 하였다.
		// 이 코드가 실행된면 철수성적, 영희성적, 민수성적 객체는 
		// 인스턴스 화(化) 되었다.
		ScoreService 철수성적 = new ScoreService();
		ScoreService 영희성적 = new ScoreService();
		ScoreService 민수성적 = new ScoreService();
		
		철수성적.scoreKor = 90;
		철수성적.scoreEng = 80;
		철수성적.scoreMath = 90;
		
		영희성적.scoreKor = 70;
		영희성적.scoreEng = 100;
		영희성적.scoreMath = 90;
		
		민수성적.scoreKor = 80;
		민수성적.scoreEng = 90;
		민수성적.scoreMath = 90;
		
		
		System.out.println(철수성적.scoreKor + 철수성적.scoreEng+철수성적.scoreMath);
		
		System.out.println(철수성적.getScoreTotal());
		System.out.println(영희성적.getScoreTotal());
		System.out.println(민수성적.getScoreTotal());
		
		//클래스와 객체를 알기전에 평균을 구해야한다면
		System.out.println((float)철수성적.getScoreTotal()/3);
		System.out.println((float)영희성적.getScoreTotal()/3);
		System.out.println((float)민수성적.getScoreTotal()/3);
		
		//클래스와 객체를 알고 난 후에는 
		//1. 클래스에 평균을 계산하는 method 를 만들고
		System.out.println(철수성적.getScoreAvg());
		System.out.println(영희성적.getScoreAvg());
		System.out.println(민수성적.getScoreAvg());
		
		
	}
	
}
