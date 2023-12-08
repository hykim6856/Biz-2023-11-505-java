package com.callor.score.exec.scores;

import com.callor.score.model.ScoreDto;

public class ScoreA {
	
	public static void main(String[] args) {
		/*
		 * ScoreDto 클래스는 마치 변수처럼 선언하고
		 * 생성하여 사용할수 있다
		 * 
		 * 사용자 정의 변수(User Define Variable)
		 * ScoreDto 클래스 type 의 scoreDto 변수를 선언하고
		 * 생성자(new ScoreDto())를 사용하여 초기화한다
		 */
		ScoreDto scoreDto = new ScoreDto();
		
		// scoreDto 객체를 통하여 ScoreDto 에 선언된
		// 맴버변수에 접근(값을 할당하거나, 읽기)할수 있다
		scoreDto.stdNum = "0001";
		scoreDto.kor = 80;
		scoreDto.eng = 90;
		
		// scoreDto 객체의 맴버변수인 kor 변수에 저장된 값을
		// scoreKor 라는 변수를 선언하고 복사하기
		int scoreKor = scoreDto.kor;
		
		System.out.println(scoreDto.kor);
		
		// getTotal() 이라는 method 를 통해서
		// 총점(scoreEto.total) 변수의 값을 읽을 수 있다
		// ScoreDto.total 변수에 외부에서 직접 접근을 차단하고
		// scoreDto.getTotal() method 를 통해서만
		// 값을 읽기만 가능하도록 설계되어 있다
		// 이러한 수행을 "정보은닉" 이라고 한다
		
		// 또한 scoreDto 객체를 통하여 호출된 getTotal() method 는
		// 과목의 총점을 정확히 알려줄 것이다 라는 믿음을 갖는다
		// 내부의 코드가 어떻게 만들어져 있는지는 몰라도
		// 총점은 정확히 계산되어 사용할수 있다 라는 믿음
		// 이것을 "캡슐화"라고 한다
		// 		어떤 method 가 어떤 코드로 실행되는지는 몰라도
		// 		그 method 를 호출했을 때 내가 원하는 정보를 
		// 		알려줄 것이다 라는 믿음
		int total = scoreDto.getTotal();
		float avg = scoreDto.getAvg();
		
		System.out.printf("총점 : %d 평균 : %5.2f\n",total , avg);
		
		
	}

}
