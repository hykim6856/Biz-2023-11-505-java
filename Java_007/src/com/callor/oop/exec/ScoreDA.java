package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;

public class ScoreDA {
	public static void main(String[] args) {
//10개의 배열의 각 과목점수를 랜덤으로 생성하고자 한다.
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
