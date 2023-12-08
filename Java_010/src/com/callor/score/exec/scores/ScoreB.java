package com.callor.score.exec.scores;

// 도구 import Ctrl + Shift + O
import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;

public class ScoreB {
	public static void main(String[] args) {
		NumberService numServic = new NumberService();
		ScoreDto scoreDto = new ScoreDto();
		
		int start = 50;
		int end = 100;
		
		int num1 = numServic.inputNumber("국어 점수를", start, end);
		int num2 = numServic.inputNumber("영어 점수를", start, end);
		int num3 = numServic.inputNumber("수학 점수를", start, end);
		
		scoreDto.kor = num1;
		scoreDto.eng = num2;
		scoreDto.kor = num3;
		System.out.printf("세 점수의 총점 : %d",scoreDto.getTotal());
		
	}

}
