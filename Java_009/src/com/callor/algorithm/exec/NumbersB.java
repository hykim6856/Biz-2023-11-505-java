package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersB {
	public static void main(String[] args) {
		Line.dLine(50);
		NumberService numService = new NumberService();
		int num = numService.inputNum("숫자를");
		Line.sLine(50);

		for (int i = 0 ; i < num ; i ++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		Line.dLine(50);
	}
}
