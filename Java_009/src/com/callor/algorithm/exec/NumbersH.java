package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.service.ScoreService;
import com.callor.algorithm.utils.Line;

public class NumbersH {
	public static void main(String[] args) {
		
		NumberService numService = new NumberService();
		Line.dLine(50);
		int num1 =numService.inputNum("점수를 ");
		int num2 =numService.inputNum("점수를 ");
		int num3 =numService.inputNum("점수를 ");
		Line.sLine(50);
		
		float avg= (num1+num2+num3)/3;
		
		if ( (int)avg >= 60) {
			System.out.println("합격입니다");
			
		}else {
			System.out.println("낙제입니다.");
		}
		
	}
}
