package com.callor.score.exec.scores;

import java.util.List;
import java.util.ArrayList;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;
import com.callor.score.uitls.Line;

public class ScoreC {

	public static void main(String[] args) {
		List<ScoreDto> scores = null;
		ScoreDto scoreDto = new ScoreDto();
		NumberService numservice = new NumberService();
		
		int start = 50;
		int end = 100;
		
		int num1 = numservice.inputNumber("첫번째 정수를", start, end);
		int num2 = numservice.inputNumber("두번째 정수를", start, end);
		int num3 = numservice.inputNumber("세번째 정수를", start, end);

		scores = new ArrayList<>();

		scoreDto.kor = num1;
		scoreDto.eng = num2;
		scoreDto.math = num3;

		scores.add(scoreDto);
		
	
		Line.dTitle("성적리스트", 50);
		System.out.println("국어\t영어\t수학\t총점\t");
		Line.sLine(50);
		
		for(ScoreDto scoreDto1 :scores) {
			System.out.printf("%3d \t", scoreDto1.kor);
			System.out.printf("%3d \t", scoreDto1.eng);
			System.out.printf("%3d \t", scoreDto1.math);
			System.out.printf("%3d \t", scoreDto1.getTotal());
		}
	
		
	}

}
