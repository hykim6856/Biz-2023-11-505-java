package com.callor.score;

public class RndScore {

	public static void main(String[] args) {
		ScoreService scoreService = new ScoreService();
		int stdNum = 10;
		for (int i = 0; i < stdNum; i++) {
			scoreService.creScore();
		}
		scoreService.printScore();
	}
}
