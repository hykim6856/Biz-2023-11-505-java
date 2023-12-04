package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;
import com.callor.oop.utils.Line;

public class ScoreCA {
	public static void main(String[] args) {
		ScoreService[] scores = new ScoreService[10];
		
		for (int i = 0; i < scores.length; i++) {
			scores [i]= new ScoreService();
		}
		
		Line.dtitle("성적표");
		
		Line.title(50,"성적표");
		
	}
}
