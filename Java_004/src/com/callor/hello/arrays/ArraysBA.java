package com.callor.hello.arrays;

public class ArraysBA {
	public static void main(String[] args) {
		//매직스트링을 대신하는 변수는 모두 대분자 _로 구분하는 snack_
		int sum = 0;
		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[STUDENT_LENGTH];
		for (int i = 0; i < scoreKors.length; i++) {
			int rndN = (int) (Math.random() * 50) + 51;
			scoreKors[i] = rndN;
		}
		for (int i = 0; i < scoreKors.length; i++) {
			sum += scoreKors[i];

		}
		/*
		 * 평균을 실수값(float)으로 계산하기 위해 
		 * 정수형인 총점이나, length 중에 하나를 float 로 변환한 후 나눗셈을 수행한다
		 * 명시적인, 강제적인, 형변환이라고 한다.
		 */
		float avg = (float)sum/scoreKors.length;
		System.out.println("=".repeat(50));
		System.out.printf("국어 점수 총점 : %d, 평균 %.2f\n", sum, avg);
		System.out.println("=".repeat(50));
		
	}
}
