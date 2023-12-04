package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;

public class ScoreD {
	public static void main(String[] args) {

		ScoreService[] scores = new ScoreService[10];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreService();

		}
		for (int index = 0; index < 3; index++) {
			scores[index].scoreKor = (int) (Math.random() * 50) + 51;
			scores[index].scoreEng = (int) (Math.random() * 50) + 51;
			scores[index].scoreMath = (int) (Math.random() * 50) + 51;
		}

	}

}
