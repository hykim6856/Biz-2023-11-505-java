package com.callor.score.exec.scores;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;
import com.callor.score.utils.Line;

public class ScoreC {
	private List<ScoreDto> scores = null;
	
	public ScoreC() {
		scores = new ArrayList<>();
	}
	
	public static void loadScores() {
		NumberService numSercvice = new NumberService();
		ScoreDto scoreDto = new ScoreDto();
		List<ScoreDto> scores = new ArrayList<ScoreDto>();
		
		int start = 50;
		int end = 100;
		
		int num1 = numSercvice.inputNumber("첫 번째 학생의 국어의 점수를", start, end);
		int num2 = numSercvice.inputNumber("첫 번째 학생의 영어의 점수를", start, end);
		int num3 = numSercvice.inputNumber("첫 번째 학생의 수학의 점수를", start, end);
		
		scoreDto.kor = num1;
		scoreDto.eng = num2;
		scoreDto.math = num3;
		scores.add(scoreDto);
		System.out.println(scores.size());
		
//		int num4 = numSercvice.inputNumber("두 번째 학생의 국어의 점수를", start, end);
//		int num5 = numSercvice.inputNumber("두 번째 학생의 영어의 점수를", start, end);
//		int num6 = numSercvice.inputNumber("두 번째 학생의 수학의 점수를", start, end);
//		scoreDto.kor = num4;
//		scoreDto.eng = num5;
//		scoreDto.math = num6;
//		scores.add(scoreDto);
//		
//		int num7 = numSercvice.inputNumber("세 번째 학생의 국어의 점수를", start, end);
//		int num8 = numSercvice.inputNumber("세 번째 학생의 영어의 점수를", start, end);
//		int num9 = numSercvice.inputNumber("세 번째 학생의 수학의 점수를", start, end);
//		scoreDto.kor = num7;
//		scoreDto.eng = num8;
//		scoreDto.math = num9;
//		scores.add(scoreDto);
		
	}
	
	
	public static void main(String[] args) {
		loadScores();
		List<ScoreDto> scores = new ArrayList<ScoreDto>();
		int num = 40;
		Line.dLine(num);
		System.out.println("성적 리스트");
		Line.dLine(num);
		System.out.println("국어\t영어\t수학\t총점");
		Line.sLine(num);
		for (int i = 0; i < scores.size(); i++) {
			ScoreDto scoreDto = scores.get(i);
			System.out.printf("%d\t%d\t%d\t%d",
					scoreDto.kor,scoreDto.eng,scoreDto.math,scoreDto.getTotal());
		}
		Line.dLine(num);
		
	}

}
