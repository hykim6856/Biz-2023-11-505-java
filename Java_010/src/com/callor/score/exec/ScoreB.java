package com.callor.score.exec;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;

public class ScoreB {
	public static void main(String[] args) {
		NumberService numservice = new NumberService();
		ScoreDto scoreDto = new ScoreDto();

		int start = 50;
		int end = 100;

		int num1 = numservice.inputNumber("정수를", start, end);
		int num2 = numservice.inputNumber("정수를", start, end);
		int num3 = numservice.inputNumber("정수를", start, end);

		scoreDto.kor = num1;
		scoreDto.eng = num2;
		scoreDto.math = num3;

		System.out.printf("총점 : %d\n", scoreDto.getTotal());
	}
}
