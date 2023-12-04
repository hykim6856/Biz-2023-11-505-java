package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;

public class ScoreE {
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

		
		System.out.println("=".repeat(50));
		System.out.println(" 국어\t 영어\t 수학\t 총점\t 평균\t");
		System.out.println("-".repeat(50));
		
		System.out.println("=".repeat(50));
	}//메인

}
