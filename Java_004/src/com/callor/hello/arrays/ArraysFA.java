package com.callor.hello.arrays;
//선생님 깃허브 참조하기

public class ArraysFA {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int SUBJECT_COUNT = 3;

		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] scoreEngs = new int[STUDENT_LENGTH];
		int[] scoreMaths = new int[STUDENT_LENGTH];

		int[] sum = new int[STUDENT_LENGTH];
		float[] avg = new float[STUDENT_LENGTH];

		int[] totalSum = new int[SUBJECT_COUNT];
	

		int[] totalAvg = new int[SUBJECT_COUNT];
	

		int sS = 0;
		int avg2 = 0;

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

		// 과목별 점수 총점
		for (int i = 0; i < SUBJECT_COUNT; i++) {
			totalSum[i] += sum[i];

		}
		// 총점의 총점============================================

		for (int i = 0; i < SUBJECT_COUNT; i++) {
			sS += totalSum[i];
		}

		// 국어 점수 평균
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			totalAvg[i] = totalSum[i] / STUDENT_LENGTH;
		}

		// 평균의 평균===========================================
		for (int i = 0; i < SUBJECT_COUNT; i++) {
			avg2 += totalAvg[i] / SUBJECT_COUNT;
		}
		avg2 /= SUBJECT_COUNT;
		// 성적표 출력
		System.out.println("=".repeat(50));
		System.out.println("  샛별반 성적표");
		System.out.println("-".repeat(50));
		System.out.println(" 학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			System.out.printf("%3d\t", i + 1);
			System.out.printf("%3d\t", scoreKors[i]);
			System.out.printf("%3d\t", scoreEngs[i]);
			System.out.printf("%3d\t ", scoreMaths[i]);
			System.out.printf("%3d\t", sum[i]);
			System.out.printf("%5.2f\n", avg[i]);
		}
		// 과목별 총점 출력
		System.out.println("-".repeat(50));
		System.out.print("총점\t");
		for (int i = 0; i < SUBJECT_COUNT; i++) {
		System.out.printf("%3d\t", totalSum[i]);
		}
		System.out.printf("%3d\t\n", sS);

		// 과목별 평균 출력
		System.out.print("평균");
		for (int i = 0; i < SUBJECT_COUNT; i++) {
			System.out.printf("%3d\t", totalAvg[i]);
			}
		System.out.printf("\t%3d\n", avg2);
		System.out.println("=".repeat(50));
	}
}