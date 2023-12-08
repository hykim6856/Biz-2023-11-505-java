package com.callor.score.exec.scores;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;
import com.callor.score.utils.Line;

public class ScoreDA {
	public static void main(String[] args) {
		NumberService numservice = new NumberService();
		List<ScoreDto> scores = new ArrayList<ScoreDto>();

		int start = 50;
		int end = 100;
		String stdNum = "";

		for (int i = 0; i < 3; i++) {
			stdNum = String.format("S%04d", i + 1);
			
			ScoreDto scoreDto = new ScoreDto();
			int scoreKor = numservice.inputNumber(stdNum + "번의 국어 점수", start, end);
			int scoreEng = numservice.inputNumber(stdNum + "번의 영어 점수", start, end);
			int scoreMath = numservice.inputNumber(stdNum + "번의 수학 점수", start, end);
			
			scoreDto.stdNum =stdNum;
			scoreDto.kor = scoreKor;
			scoreDto.eng = scoreEng;
			scoreDto.math = scoreMath;

			scores.add(scoreDto);
		}
		Line.dLine(40);
		System.out.println("성적 리스트");
		Line.dLine(40);
		System.out.println("학번\t국어\t영어\t수학\t총점");
		Line.sLine(40);
		int size = scores.size();
		for (int i = 0; i < size; i++) {
			ScoreDto dto = scores.get(i);
			System.out.printf("%s\t", dto.stdNum);
			System.out.printf("%3d\t", dto.kor);
			System.out.printf("%3d\t", dto.eng);
			System.out.printf("%3d\t", dto.math);
			System.out.printf("%3d\n", dto.getTotal());
		}
		
		// 확장 for(forEach) : 배열, List 전체 요소를
		// 출력하거나, 연산할때 사용하는 새로운 for
		for(ScoreDto dto : scores) {
			System.out.printf("%s\t", dto.stdNum);
			System.out.printf("%3d\t", dto.kor);
			System.out.printf("%3d\t", dto.eng);
			System.out.printf("%3d\t", dto.math);
			System.out.printf("%3d\n", dto.getTotal());
		}
		
		Line.dLine(40);
	}

}
