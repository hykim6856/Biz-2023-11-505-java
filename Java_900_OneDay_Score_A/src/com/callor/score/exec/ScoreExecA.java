package com.callor.score.exec;

import com.callor.score.service.ScoreServiceV1;

public class ScoreExecA {
	
public static void main(String[] args) {
	ScoreServiceV1 scoreService = new ScoreServiceV1();
	scoreService.makeScore(10);
	scoreService.printScore();
	
	ScoreServiceV1 scoreService1 = new ScoreServiceV1();
	scoreService1.makeScore(10);
	
	//잠시 멈춘 상태
}

}
