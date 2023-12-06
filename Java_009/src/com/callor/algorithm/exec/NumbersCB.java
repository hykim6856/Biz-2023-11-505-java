package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersCB {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		Line.dLine(50);
		int num = numService.inputNum("숫자를 ");
		Line.sLine(50);

		for (int i = 0; i < num; i++) {
			// i 0:j=0 ; j < 7 : 7-0
			// i 1:j=0 ; j < 6 : 6-0
			// i 2:j=0 ; j < 5 : 5-0
			// i 3:j=0 ; j < 4 : 4-0
			// i 4:j=0 ; j < 3 : 3-0
			// i 5:j=0 ; j < 2 : 2-0
			// i 6:j=0 ; j < 1 : 1-0
			for (int j = 0; j < num - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*for (int i = 0; i < num; i++) {
			// i 0:j=0 ; j < 7 : 7-0
			// i 1:j=0 ; j < 6 : 6-0
			// i 2:j=0 ; j < 5 : 5-0
			// i 3:j=0 ; j < 4 : 4-0
			// i 4:j=0 ; j < 3 : 3-0
			// i 5:j=0 ; j < 2 : 2-0
			// i 6:j=0 ; j < 1 : 1-0
			for (int j = num; j > i ; j++) {
				System.out.print("*");
				break;
			}
			System.out.println();
			Line.dLine(50);
		}*/
	}
}
