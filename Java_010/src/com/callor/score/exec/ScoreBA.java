package com.callor.score.exec;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;

public class ScoreBA {
	public static void main(String[] args) {
		int[] nums = new int[3];

		NumberService numservice = new NumberService();
		ScoreDto scoreDto = new ScoreDto();
		nums[1] = 0;

		for (int i = 0; i < 3; i++) {
			System.out.printf("%d 번째", i+1);
			nums[i] = numservice.inputNumber("정수를", 50, 100);
		}
		int i = 0;
		scoreDto.kor = nums[i++];
		scoreDto.eng = nums[i++];
		scoreDto.math = nums[i++];

		System.out.printf("3과목의 합 %d", scoreDto.getTotal());
	}
}
