package com.callor.hello.arrays;

public class ArraysB {
	public static void main(String[] args) {
		int sum = 0;
		int arraysLength = 10;
		int[] scoreKors = new int[arraysLength];
		for (int i = 0; i < scoreKors.length; i++) {
			int rndN = (int) (Math.random() * 50) + 51;
			scoreKors[i] = rndN;
		}
		for (int i = 0; i < scoreKors.length; i++) {
			sum += scoreKors[i];

		}
		double avg = (double)sum/scoreKors.length;
		System.out.println("====================================");
		System.out.printf("국어 점수 총점 : %d, 평균 : %d.%d\n", sum, (int)avg, (int)(avg*100)%100);
		System.out.printf("국어 점수 총점 : %d, 평균 : %.2f\n", sum, avg);
		System.out.println("====================================");
	}
}
