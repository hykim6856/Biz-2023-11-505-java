package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersDB {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		Line.dLine(50);
		int sum = 0;
		int count = 0;
		while (sum < 1000) {
			int num = numService.inputNum("숫자를 ");
			sum += num;
			count++;

		}
		Line.sLine(50);
		System.out.printf("%d번 입력한 숫자 총합 : %d\n", count, sum);
		Line.dLine(50);
	}
}
