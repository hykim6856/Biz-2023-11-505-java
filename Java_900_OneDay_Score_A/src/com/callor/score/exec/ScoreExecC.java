package com.callor.score.exec;

import com.callor.score.service.ScoreServiceV3;

public class ScoreExecC {

	public static void main(String[] args) {
		ScoreServiceV3 scoreService = new ScoreServiceV3();
		scoreService.makeScore(10);
		scoreService.makeScore();
	}
}
