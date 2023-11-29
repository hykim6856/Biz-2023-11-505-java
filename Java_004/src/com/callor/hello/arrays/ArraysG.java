package com.callor.hello.arrays;

public class ArraysG {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int TEST_SCORE = 9;

		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] test = new int[TEST_SCORE];
		
		//boolean[] score = new boolean[TEST_SCORE];

		// 국어 점수 할당
		for (int i = 0; i < scoreKors.length; i++) {
			int rndScore = (int) (Math.random() * 50) + 51;
			scoreKors[i] = rndScore;
		}
		// 평가 점수 
		/*for (int i = 1; i < TEST_SCORE+1; i++) {
			for (int n = 1; n<TEST_SCORE+1;n++) {
			if(scoreKors[i]>100-(5*n)) {
				test[i] = i;
				break;
			}
			}
		}*/
		//평가점수 검사식
		for (int i = 0; i < TEST_SCORE; i++) {
			if (scoreKors[i]<95-(i*5)) {
				
				
			}
		}

		// 성적표 출력

		for (int i = 0; i < STUDENT_LENGTH; i++) {
			System.out.printf("%d\n", scoreKors[i]);
		}

	}
}