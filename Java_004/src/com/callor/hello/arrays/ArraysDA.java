package com.callor.hello.arrays;

public class ArraysDA {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] scoreEngs = new int[STUDENT_LENGTH];
		int[] scoreMaths = new int[STUDENT_LENGTH];
		int[] sum = new int[STUDENT_LENGTH];
		float[] avg = new float[STUDENT_LENGTH];

		// 국어 점수 할당
		for (int i = 0; i < scoreKors.length; i++) {
			int rndScore = (int) (Math.random() * 50) + 51;
			scoreKors[i] = rndScore;
		}
		// 영어 점수 할당
		for (int i = 0; i < scoreEngs.length; i++) {
			int rndScore = (int) (Math.random() * 50) + 51;
			scoreEngs[i] = rndScore;
		}
		// 수학 점수 할당
		for (int i = 0; i < scoreMaths.length; i++) {
			int rndScore = (int) (Math.random() * 50) + 51;
			scoreMaths[i] = rndScore;

		}
		// 계산
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			sum[i] = scoreKors[i];
			sum[i] += scoreEngs[i];
			sum[i] += scoreMaths[i];
			avg[i] = (float)sum[i]/STUDENT_LENGTH; 
			
		}

		// 성적표 출력
		System.out.println("=".repeat(40));
		System.out.println("  샛별반 성적표");
		System.out.println("-".repeat(40));
		System.out.println("국어\t영어\t수학\t 총점\t평균");
		System.out.println("-".repeat(40));
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			System.out.printf("%3d\t%3d\t%3d\t %3d\t%5.2f\n", scoreKors[i], scoreEngs[i], scoreMaths[i], sum[i],
					avg[i]);
		}
		System.out.println("=".repeat(40));
	}
}