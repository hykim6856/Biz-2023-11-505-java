package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;

public class ScoreC {
	public static void main(String[] args) {
		ScoreService[] scores = new ScoreService[10];
		
		for (int i = 0; i < 10; i++) {
			scores [i]= new ScoreService();
			

		}
	}
}
