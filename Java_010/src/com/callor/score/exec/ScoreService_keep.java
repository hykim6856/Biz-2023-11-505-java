package com.callor.score.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;

public class ScoreService_keep {
private	List<ScoreDto> scores = null;
private NumberService numService = null;
	public ScoreService_keep() {
		scores = new ArrayList<ScoreDto>();
		numService = new NumberService();
	}
	/*
	public static void inputScore() {
		int scoreKor = numService.inputNumber("국어 점수를");
		int scoreKor = numService.inputNumber("국어 점수를");
		int scoreKor = numService.inputNumber("국어 점수를");
		
		scores.add(scoreDto);
	}
	public static void inputScore(int start, int end) {
		int scoreKor = numService.inputNumber("국어 점수를",start, end);
		int scoreKor = numService.inputNumber("국어 점수를",start, end);
		int scoreKor = numService.inputNumber("국어 점수를", start , end);
		ScoreDto scoreDto = new ScoreDto();
	}*/
}