package com.callor.hello.arrays;

public class ArraysGC {
	public static void main(String[] args) {
		int[] scoreKors = new int[10];
		for (int i = 0; i < scoreKors.length; i++) {
			scoreKors[i] = (int) (Math.random() * 50) + 51;
		}
		
		for (int i = 0; i < scoreKors.length; i++) {
			String gradeScore = "";
			
			if (scoreKors[i] >= 95&&scoreKors[i] <=100)
				gradeScore = "A+";
			else if (scoreKors[i] >= 90&&scoreKors[i] < 95)
				gradeScore = "A";
			else if (scoreKors[i] >= 85)
				gradeScore = "B+";
			else if (scoreKors[i] >= 80)
				gradeScore = "B";
			else if (scoreKors[i] >= 75)
				gradeScore = "C+";
			else if (scoreKors[i] >= 70)
				gradeScore = "C";
			else if (scoreKors[i] >= 65)
				gradeScore = "D+";
			else if (scoreKors[i] >= 60)
				gradeScore = "D";
			else if (scoreKors[i] < 60)
				gradeScore = "F";

		}
	}
}