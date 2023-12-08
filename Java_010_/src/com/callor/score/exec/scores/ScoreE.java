package com.callor.score.exec.scores;

import com.callor.score.service.ScoreService;
import com.callor.score.utils.Line;

public class ScoreE {
	public static void main(String[] args) {
		ScoreService scoreService = new ScoreService();
		
//		for(int i = 0; i < 100 ; i ++) {
		scoreService.inputScore(0,100);
//		}
		

			Line.dLine(40);
			System.out.println("성적 리스트");
			Line.dLine(40);
			System.out.println("학번\t국어\t영어\t수학\t총점");
			Line.sLine(40);
			
	}
}
