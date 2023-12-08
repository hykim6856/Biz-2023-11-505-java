package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.utils.Line;

public class ScoreService {
	// 클래스 영역에서 선언만 하고
	private List<ScoreDto> scores = null;
	private NumberService numService = null;

	// 생성자에서
	public ScoreService() {
		// 초기화(사용할 준비하기)
		scores = new ArrayList<ScoreDto>();
		numService = new NumberService();
	}

	/*
	 * 인풋스코어 method를 매개변수 없이 호출하면
	 * 매서드 내부에서 스탈트 값과 엔드 값 임의로 생성하고
	 * 현재 클래스 에 있는
	 * 		인풋스코어(int start, int end)를 전달
	 */
	
	public void inputScore() {
		
		int start = 0;
		int end = 100;
		//this. : ScoreService 클래스를 나타내는 특별한 변수
		this.inputScore(start,end);
		

	} // end inputScore()

	public void inputScore(int start, int end) {
		
		/*
		 * 점수를 저장할때 학번을 자동생성하여 저장하고 싶다
		 * 우리의 학번은 230001 ~ 형식으로 만들고 싶다
		 */
		
		// Scores 리스트에 저장되어있는 가장 마지막 요소(제일 끝 index 요소) 에데이터 중
		// 서 학변을 가져와서
		// strStdNum 변수에 할당하라
//		String strStdNum = ""; 
//		if (scores.size() > 0) {
//			strStdNum = scores.get(scores.size() - 1).stdNum;
//		} else {
//			strStdNum = "230001";
//		}
		
		// 위의 else ... 한 부분을 참고하여
		// 만약 scores 리스트에 데이터가 한개라도 있으면
		// 마지막 요소의 학번을 strStdNum 에 할당하고
		// 그렇지 않으면 strStdNum 의 초기값인
		// 230000 을 그대로 유지하라
		String strStdNum = "230000";
		if(scores.size() > 0) {
			strStdNum = scores.get(scores.size() - 1).stdNum;
		}
		
		int intStdNum = Integer.valueOf(strStdNum.substring(2));
		intStdNum++;
		
		strStdNum = String.format("23%04d", intStdNum);
		
		
		int scoreKor = numService.inputNumber(strStdNum + " 번의 국어 점수를", start, end);
		int scoreEng = numService.inputNumber(strStdNum + " 번의 영어 점수를", start, end);
		int scoreMath = numService.inputNumber(strStdNum + " 번의 수학 점수를", start, end);

		ScoreDto scoreDto = new ScoreDto();
		scoreDto.stdNum = strStdNum;
		scoreDto.kor = scoreKor;
		scoreDto.eng = scoreEng;
		scoreDto.math = scoreMath;

		scores.add(scoreDto);
	}
	
	public void printScore() {
		Line.dLine(50);
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		Line.sLine(50);
		for(ScoreDto dto : scores) {
			
			System.out.printf("%s\t",dto.stdNum);
			System.out.printf("%3d\t",dto.kor);
			System.out.printf("%3d\t",dto.eng);
			System.out.printf("%3d\t",dto.math);
			
			System.out.printf("%3d\t",dto.getTotal());
			System.out.printf("%5.2f\n",dto.getAvg());
		}
		Line.dLine(50);
	}

}
