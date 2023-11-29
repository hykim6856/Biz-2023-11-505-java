package com.callor.hello.service;

/*
 * 스코어 서비스 클래스
 * 서픽스 서비스인 클래스
 * 여기에는 메인 메소드가 없다
 * 여기에 선언된 메소드들은 다른 클래스 파일에서 호출하는 용도이다.
 * ScoreService.Score 처럼
 * 이때 서비스 클래스는 메소드들을 모아두는 묶음 역할을한다.
 */
public class ScoreService {
	public static int[] score(int length) {
		int[] scores = new int[length];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = (int) (Math.random() + 50) + 51;
		}
		return scores;
	}

	public static String gradeScore(int score) {
		String result = "F";
		if (score >= 95)
			result = "A+";
		else if (score >= 95)
			result = "A";
		else if (score >= 95)
			result = "B+";
		else if (score >= 95)
			result = "B";
		else if (score >= 95)
			result = "C+";
		else if (score >= 95)
			result = "C";
		else if (score >= 95)
			result = "D+";
		else if (score >= 95)
			result = "D";

		return result;
	}
}
