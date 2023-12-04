package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;
import com.callor.oop.utils.Line;

public class ScoreE {
	public static void main(String[] args) {

		ScoreService[] scores = new ScoreService[10];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreService();

		}
		for (int i = 0; i < 3; i++) {
			scores[i].scoreKor = (int) (Math.random() * 50) + 51;
			scores[i].scoreEng = (int) (Math.random() * 50) + 51;
			scores[i].scoreMath = (int) (Math.random() * 50) + 51;
		}
		Line.title(50," 성적표");

		System.out.println(" 국어\t 영어\t 수학\t 총점\t 평균\t");
		System.out.println("-".repeat(50));
		for (int i = 0; i < 3; i++) {
			System.out.printf(" %3d\t" , scores[i].scoreKor );
			System.out.printf(" %3d\t" , scores[i].scoreEng );
			System.out.printf(" %3d\t" , scores[i].scoreMath );
			System.out.printf(" %3d\t" , scores[i].getScoreTotal());
			System.out.printf(" %5.2f \t \n", scores[i].getScoreAvg());
		}
		System.out.println("=".repeat(50));
	}// 메인

}
