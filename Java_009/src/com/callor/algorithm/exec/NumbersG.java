package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.service.ScoreService;
import com.callor.algorithm.utils.Line;

public class NumbersG {
	public static void main(String[] args) {
		
		NumberService numService = new NumberService();
		Line.dLine(50);
		int num =numService.inputNum("점수를 ");
		Line.sLine(50);
		
		ScoreService scoreService = new ScoreService();
		
		String grade = scoreService.gradeScore(num);
		System.out.printf("%s 입니다.\n", grade);
		
		scoreService.gradement(num);
	}
}
