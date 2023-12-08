package com.callor.score;

import com.callor.score.service.ScoreService;

public class RndScore {

	public static void main(String[] args) {
		ScoreService scoreService = new ScoreService();
		// 출력하고자 하는 학생 수
		int stdnum = 10;
		scoreService.creScore(stdnum);
		scoreService.printScore();
	}
}
