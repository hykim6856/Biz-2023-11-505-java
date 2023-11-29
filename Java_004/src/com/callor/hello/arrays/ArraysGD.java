package com.callor.hello.arrays;

public class ArraysGD {
	/*
	 * score 변수에 정수값 (점수)을 전달받아서 점수에 따라 평점을 찾고 평점을 리턴하는
	 */
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

	public static void main(String[] args) {
		int STUDENT = 10;
		int[] scoreKors = new int[STUDENT];
		for (int i = 0; i < 10; i++) {
			int ran = (int) (Math.random() * 50) + 51;
			scoreKors[i] = ran;
		}
		System.out.println("=".repeat(30));
		System.out.println("국어\t평점");
		System.out.println("-".repeat(30));
		for (int i = 0; i < 10; i++) {
			System.out.print(scoreKors[i]);
			String gradeScore = gradeScore(scoreKors[i]);
			System.out.println("\t"+gradeScore);
		}
	}
}
