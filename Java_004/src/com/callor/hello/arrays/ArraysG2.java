package com.callor.hello.arrays;

public class ArraysG2 {
	public static void main(String[] args) {

		        // 10명의 학생 국어 점수를 저장할 배열
		        int[] scoreKors = new int[10];

		        // 51부터 100까지의 범위의 임의의 점수를 생성하여 배열에 할당
		       
		        for (int i = 0; i < 10; i++) {
		        	int rndScore = (int) (Math.random() * 50) + 51;
					scoreKors[i] = rndScore; // 51부터 100까지의 난수 생성
		        }

		        // 국어 점수와 등급 출력
		        for (int i = 0; i < 10; i++) {
		            int score = scoreKors[i];
		            String grade = calculateGrade(score);
		            System.out.println(score+"   " + grade+"");
		        }
		    }

		    // 등급을 계산하는 메서드
		    private static String calculateGrade(int score) {
		        if (score >= 95 && score <= 100) {
		            return "A+";
		        } else if (score >= 90 && score <= 94) {
		            return "A";
		        } else if (score >= 85 && score <= 89) {
		            return "B+";
		        } else if (score >= 80 && score <= 84) {
		            return "B";
		        } else if (score >= 75 && score <= 79) {
		            return "C+";
		        } else if (score >= 70 && score <= 74) {
		            return "C";
		        } else if (score >= 65 && score <= 69) {
		            return "D+";
		        } else if (score >= 60 && score <= 64) {
		            return "D";
		        } else {
		            return "F";
		        }
		    }
		

	}

