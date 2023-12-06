package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.service.ScoreService;
import com.callor.algorithm.utils.Line;

public class NumbersH2 {
	public static void main(String[] args) {

		NumberService numService = new NumberService();
		int[] nums = new int[3];
		int sum = 0;
		Line.dLine(50);
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d 번째 과목", i+1);
			nums[i] = numService.inputNum("점수를 ");
		}
		Line.sLine(50);
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		float avg = (float) sum / nums.length;

		if (avg >= 60) {
			System.out.print("축하합니다.\n합격입니다");
		} else {
			System.out.println("아쉽지만\n낙제입니다.");
		}

	}
}
