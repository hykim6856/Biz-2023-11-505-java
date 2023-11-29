package com.callor.hello.arrays;

public class ArraysE {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;

		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] scoreEngs = new int[STUDENT_LENGTH];
		int[] scoreMaths = new int[STUDENT_LENGTH];

		int[] sum = new int[STUDENT_LENGTH];
		float[] avg = new float[STUDENT_LENGTH];

		int sK = 0;
		int sE = 0;
		int sM = 0;

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
		
		// 총점 계산
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			sum[i] = scoreKors[i];
			sum[i] += scoreEngs[i];
			sum[i] += scoreMaths[i];
		}
		// 평균계산
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			avg[i] = (float) sum[i] / STUDENT_LENGTH;
		}
		
		// 국어 점수 총점
		for (int i = 0; i < scoreKors.length; i++) {
			sK += scoreKors[i];
		}
		// 영어 점수 총점
		for (int i = 0; i < scoreEngs.length; i++) {
			sE += scoreEngs[i];
		}
		// 수학 점수 총점
		for (int i = 0; i < scoreMaths.length; i++) {
			sM += scoreMaths[i];
		}
		/* 이것도 가능
		 * for (int i = 0; i < scoreKors.length; i++) {
			sK += scoreKors[i];
			sE += scoreEngs[i];
			sM += scoreMaths[i];*/
		
		// 성적표 출력
		System.out.println("=".repeat(50));
		System.out.println("  샛별반 성적표");
		System.out.println("-".repeat(50));
		System.out.println(" 학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			System.out.printf("%3d\t",i+1);
			System.out.printf("%3d\t", scoreKors[i]);
			System.out.printf("%3d\t", scoreEngs[i]);
			System.out.printf("%3d\t ", scoreMaths[i]);
			System.out.printf("%3d\t", sum[i]);
			System.out.printf("%5.2f\n", avg[i]);
		}
		//과목별 총점 출력
		System.out.println("-".repeat(50));
		System.out.printf("\t%3d\t",sK);
		System.out.printf("%3d\t",sE);
		System.out.printf("%3d\t\n",sM);
		System.out.println("=".repeat(50));
	}
}