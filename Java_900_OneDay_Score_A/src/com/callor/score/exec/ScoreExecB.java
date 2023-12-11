package com.callor.score.exec;

import com.callor.score.service.ScoreServiceV2;

public class ScoreExecB {
public static void main(String[] args) {
	
	ScoreServiceV2 scoreService = new ScoreServiceV2();
	scoreService.makeScore(10);
	scoreService.printScore();
}
}
