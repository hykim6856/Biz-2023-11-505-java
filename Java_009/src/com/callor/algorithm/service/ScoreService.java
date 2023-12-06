package com.callor.algorithm.service;

public class ScoreService {
	public String gradeScore(int num) {
		String score = "";
		if (num >= 95)
			score = "A+";
		else if (num >= 90)
			score = "A";
		else if (num >= 85)
			score = "B+";
		else if (num >= 80)
			score = "B";
		else if (num >= 75)
			score = "C+";
		else if (num >= 70)
			score = "C";
		else if (num >= 65)
			score = "D+";
		else if (num >= 60)
			score = "D";
		else 
			score = "F";
		return score;
	}
	public void gradement(int num) {
		if (num>=80) System.out.println("축하합니다.");
		else if (num >=70) System.out.println("좀 더 분발하세요");
		else if (num <60) System.out.println("낙제입니다.");
	}
}
