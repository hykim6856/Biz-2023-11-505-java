package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;

public class ScoreB {
	public static void main(String[] args) {
		/*
		 * 5명 학생의 성적 처리를 하기 위하여 scoreSevice클래스 를 사용하여 5개의 scores배열을 선언만한다.
		 */
		ScoreService[] scores = new ScoreService[5];

		// 0은 철수, 1은 영희, 2는 민수, 3 길동 . 4 꺽정
		// 객체 배열은 선언만 되어 있을 때에는 
		//내부에 포함하는 변수, 메소드 를 사용할 수 없다.
		//각각의 배열 요소를 다시한번 객체로 생성(new)해 주어야한다.
		scores[0] =new ScoreService();
		scores[1] =new ScoreService();
		scores[2] =new ScoreService();
		
		scores[0].scoreKor = 60;
		scores[0].scoreEng = 90;
		scores[0].scoreMath = 80;

		scores[1].scoreKor = 70;
		scores[1].scoreEng = 90;
		scores[1].scoreMath = 80;

		scores[2].scoreKor = 50;
		scores[2].scoreEng = 90;
		scores[2].scoreMath = 80;
		
		//스코어 토탈 변수는 프라이빗으로 설정되어있어서 변수에 값을 직접 참조 할수 없다.
		//스코어 토탈 변수의 값을 사용하려면 반드시 겟스코어 토탈 메소드를 통해서만 가능하다.
		//System.out.println(scores[1].scoreTotal());

		System.out.println(scores[1].getScoreTotal());
	}
}
