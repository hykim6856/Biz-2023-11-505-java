package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersF {
	public static void main(String[] args) {
		
		NumberService numService = new NumberService();
		Line.dLine(50);
		int num =numService.inputNum("정수를 ");
		Line.dLine(50);
		
		for (int dan = 2; dan < 10; dan++) {
			System.out.printf("\t %d단 구구단\n", dan);
			Line.sLine(50);
			for (int i = 1; i < 10; i++) {
				if ((dan*i) % num == 0) {
					System.out.printf("\t%d x %d = %d\n", dan, i, dan * i);
				}
			}
			Line.dLine(50);
		}
	}
}
