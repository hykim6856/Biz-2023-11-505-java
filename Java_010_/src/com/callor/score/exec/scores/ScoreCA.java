package com.callor.score.exec.scores;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;
import com.callor.score.utils.Line;

/*
 * 여러명의 학생 성적 데이터를 변수에 저장하고  처리하기
 * 
 * 데이터 소스(키보드 입력, random(), file 에서 읽기)를
 * 가지고 정보처리를 하기 위해서는
 * 먼저 각 학생 개인의 점수를 Dto 객체에 담고
 * Dto 객체 담긴 학생 개인의 점수를 List 객체에 추가한다
 * 
 */


public class ScoreCA {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		// scores 의 type 은 List
		// scores 의 요소들의 type ScoreDto
		// ScoreDto 가 여러개 포함될 리스트 변수
		// 아직은 요소가 0인 리스트 생성
		List<ScoreDto> scores = new ArrayList<ScoreDto>();

		int start = 50;
		int end = 100;


		for (int index = 0; index < 3; index++) {
			int stNum = index + 1;
			// 키보드로 입력받은 데이터를
			int scoreKor = numService.inputNumber(stNum + "번의 국어점수", start, end);
			int scoreEng = numService.inputNumber(stNum + "번의 영어점수", start, end);
			int scoreMath = numService.inputNumber(stNum + "번의 수학점수", start, end);

			// Dto 객체의 각요소에 점수를 할당하고
			ScoreDto scoreDto = new ScoreDto(); // ** 중요 ** 
			scoreDto.kor = scoreKor;
			scoreDto.eng = scoreEng;
			scoreDto.math = scoreMath;
			
			//List 객체에 추가하기
			scores.add(scoreDto);
		}
		Line.dLine(40);
		System.out.println("성적 리스트");
		Line.dLine(40);
		System.out.println("국어\t영어\t수학\t총점");
		Line.sLine(40);
		for(int i = 0; i < scores.size();i++) {
			ScoreDto dto = scores.get(i);
			
			System.out.printf("%d\t",dto.kor);
			System.out.printf("%d\t",dto.eng);
			System.out.printf("%d\t",dto.math);
			System.out.printf("%d\t\n",dto.getTotal());
		}

	}

}
