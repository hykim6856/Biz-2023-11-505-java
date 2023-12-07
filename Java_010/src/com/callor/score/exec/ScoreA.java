package com.callor.score.exec;

import com.callor.score.model.ScoreDto;

public class ScoreA {
	public static void main(String[] args) {
		/*
		 * ScoreDto 클래스는 마치 변수처럼 선언하고 생성하여 사용할 수 있다.
		 * 
		 * 사용자 정의 변수(User Define Variable) ScoreDto 클래스 type의 scoreDto 변수를 선언하고 생성자 (new
		 * ScoreDto())를 사용하여 초기화 한다.
		 */
		ScoreDto scoreDto = new ScoreDto();

		// scoreDto 객체를 통해 할당하거나
		scoreDto.stdNum = "0001";
		scoreDto.kor = 80;
		scoreDto.eng = 90;

		// scoreDto 객체의 멤버변수인 kor 변수에 저장된 값을
		// scoreKor 라는 변수를 선언하고 복사하기
		int scoreKor = scoreDto.kor;

		System.out.println(scoreDto.kor);
		// getTotal()dlfksms method를 통해서
		// 총점 변수의 값을 읽을 수 있다.
		/*
		 * 스코어 디티오 토탈 변수에 외부에서 직접 접근을 차단하고 스코어 디티오 겟토탈 메소드를 통해서만 값을 읽기만 가능하도록 설계되어있다.
		 * 이러한 수행을 정보 은닉이라고 한다.
		 */
		// 또한 scoreDto 객체를 통하여 호출된 getTotal() method는 과목의 총점을 정확히 알려줄 것이다라는 믿음을 갖는다.
		// 내부의 코드가 어떻게 만들어져있는지는 몰라도 총점은 정확히 계솬되어 사용 할 수 있다 라는 믿음
		// 이것을 캡슐화 라고 한다.
		// 캡슐화란? 어떤 메소드가 어떤 코드로 실행되는지는 몰라도 그 메소드를 호출했을때 내가 원하는 정보를 알려줄 것이다.라는 믿음.
		int total = scoreDto.getTotal();
		float avg = scoreDto.getAvg();

		System.out.printf("총점  :%d, 평균 : %5.2f", total, avg);
	}
}
