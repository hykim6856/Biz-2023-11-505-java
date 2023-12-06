package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersD {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		Line.dLine(50);
		int num = 0;
		int i = 0;
		while (num < 1000) {
			num += numService.inputNum("숫자를 ");
			i++;
		}
		Line.sLine(50);
		System.out.printf("%d번 입력한 숫자 총합 : %d\n", i, num);
		Line.dLine(50);
	}
}
