package com.callor.score.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;

public class ListA {
	public static void main(String[] args) {
		List<ScoreDto> scores = new ArrayList<ScoreDto>();
		ScoreDto scoreDto = new ScoreDto();
		
		System.out.println(scores.toString());
		System.out.println(scoreDto.toString());
		
		for(int i = 0 ; i < 10 ; i++) {
		//	scoresDto scoreDto =new ScoresDto;
			scores.add(scoreDto);
		}
		System.out.println(scores.toString());
		
		
		
	}
}
