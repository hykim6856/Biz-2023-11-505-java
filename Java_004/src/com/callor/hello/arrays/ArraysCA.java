package com.callor.hello.arrays;

public class ArraysCA {
	public static void main(String[] args) {
		System.out.println("=".repeat(30));
		System.out.println("샛별반 국어점수");
		System.out.println("-".repeat(30));
		int sum = 0;
		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[STUDENT_LENGTH];
		
		//랜덤한 수 할당
		for (int i = 0; i < scoreKors.length; i++) {
			int rndScore = (int) (Math.random() * 50) + 51;
			scoreKors[i] = rndScore;
		}
		//학생들 국어점수 출력
		for (int i = 0; i < scoreKors.length; i++) {
			System.out.printf("%2d 번 : %3d 점\n", i+1, scoreKors[i]);
		}
		// 총점계산
		for (int i = 0; i < scoreKors.length; i++) {
			sum += scoreKors[i];
		}
		// 평균계산
		float avg = (float)sum/scoreKors.length;
		
		// 총점, 평균 출력
		System.out.println("-".repeat(30));
		System.out.printf("총점 : %d, 평균 : %.2f\n",sum, avg);
		System.out.println("=".repeat(30));
	}
}