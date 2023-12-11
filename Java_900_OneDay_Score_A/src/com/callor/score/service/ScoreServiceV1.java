package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.utils.Line;

public class ScoreServiceV1 {
	/*
	 * ScoreServiceV1 을 상속하고 싶다. 이때 V1 에 선언 된 퍼블릭 메소드는 별다른 코드 변경 없이 v2 에서 그대로 사용할 수
	 * 있다. 하지만 프라이빗으로 선언된 변수는 상속이 안된다. 스코어스 객체를 v2 에서 사용하기 위하여 프로텍티브로 변경해준다.
	 */

	protected List<ScoreDto> scores = null;
	// ****null에서 초기화 하면 안됨****

	public ScoreServiceV1() {
		scores = new ArrayList<ScoreDto>();
		/*
		 * 생성자에서 아래와 같이 scores를 생성하면 생성자를 벗어난 후 scores는 소멸된다. 클래스 영역에 선언된 scores는 옂던히
		 * null이다. List
		 */
	}

//학생 한명의 학번, 과목별 점수를 임의 생성하여 스코어스에 추가하는 메서드
	public void makeScore() {

		// 랜덤한 성적 만들기
		int kor = (int) (Math.random() * 50) + 51;
		int eng = (int) (Math.random() * 50) + 51;
		int math = (int) (Math.random() * 50) + 51;
		int music = (int) (Math.random() * 50) + 51;
		int art = (int) (Math.random() * 50) + 51;

		/*
		 * 학번 자동생성 1. scores 에 추가된 성적표가 있는가 2. 없으면 최초의 이므로 23001로 학번을 세팅 3. 있으면 가장 마지막
		 * 성적표의 학번을 조회한 후 학번에 +1 하여 새로운 학번을 생성하기
		 */
		String strStdNum = "23001";
		int scoresSize = scores.size();
		if (scoresSize > 0) {
			ScoreDto dto = scores.get(scoresSize);
			strStdNum = dto.stdNum;
			strStdNum = strStdNum.substring(2);
			int intStdNum = Integer.valueOf(strStdNum);

			intStdNum++;
			strStdNum = String.format("23%04d", intStdNum);

		}

		// 한 학생의 성적표를 생성하는 과정
		ScoreDto scoreDto = new ScoreDto();
		scoreDto.stdNum = strStdNum;
		scoreDto.kor = kor;
		scoreDto.eng = eng;
		scoreDto.math = math;
		scoreDto.music = music;
		scoreDto.art = art;
		scores.add(scoreDto);
	} // end for

	// make score

	public void makeScore(int count) {
		for (int i = 0; i < count; i++) {
			this.makeScore();
		}
	}

	public void printScore() {
	
		Line.dLine(80);
		System.out.println("* 한울 고교 성적 리스트 *");
		Line.dLine(80);
		System.out.println(" 학번\t\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		Line.sLine(80);

		// for(int i = 0 ; i<scores.size();i++){
		// ScoreDto dto score. get(i);

		// scores 에서 index 번째 요소를 get 하여 dto 클래스 변수에 담아주는 일까지 한번에 처리

		for (ScoreDto dto : scores) {
			System.out.printf(" %s\t\t", dto.stdNum);

			System.out.printf("%3d\t", dto.kor);
			System.out.printf("%3d\t", dto.eng);
			System.out.printf("%3d\t", dto.math);
			System.out.printf("%3d\t", dto.music);
			System.out.printf("%3d\t", dto.art);
		}

		Line.dLine(80);
	}
}// class Score
