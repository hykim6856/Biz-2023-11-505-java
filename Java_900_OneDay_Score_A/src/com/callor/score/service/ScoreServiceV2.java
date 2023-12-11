package com.callor.score.service;

import java.util.ArrayList;

import com.callor.score.model.ScoreDto;
import com.callor.score.utils.Line;

public class ScoreServiceV2 extends ScoreServiceV1 {

	private static int 국어 = 0;
	private static int 영어 = 1;
	private static int 수학 = 2;
	private static int 음악 = 3;
	private static int 미술 = 4;

	private int[] totalScore = null;

	public ScoreServiceV2() {
		scores = new ArrayList<ScoreDto>();
		totalScore = new int[5];

	}

	@Override
	public void printScore() {
		super.printScore();
		// System.out.println("나는 v2에 추가한 코드야");
		for (ScoreDto dto : scores) {
			totalScore[국어] += dto.kor;
			totalScore[영어] += dto.eng;
			totalScore[수학] += dto.math;
			totalScore[음악] += dto.music;
			totalScore[미술] += dto.art;

		}

		int allTotal = 0;
		System.out.print("총점\t");
		for (int score : totalScore) {
			System.out.printf("%4d\t", score);
			allTotal += score;
		}
		System.out.printf("%4d\n", allTotal);
		
		float allAvg = 0 ;
		System.out.print("평균\t");
		for(int score : totalScore) {
			float avg = (float)score / scores.size();
			System.out.printf("%.2f\t" , (float)score/scores.size());
			allAvg+=avg;
		}
		System.out.printf("\t %.2f\n", allAvg / totalScore.length);
		Line.dLine(100);
	}
}
