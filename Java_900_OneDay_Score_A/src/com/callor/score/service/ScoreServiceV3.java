package com.callor.score.service;

import java.util.ArrayList;

import com.callor.score.model.ScoreDto;
import com.callor.score.model.TotalDto;

public class ScoreServiceV3 extends ScoreServiceV1 {

	public ScoreServiceV3() {
		scores = new ArrayList<ScoreDto>();
	}
	
	//V1 의 프린트 스코어 메서드를 재 정의(Override) 하겠다.
	// 원래 v1. printScore() method를 확장 하겠다.
	@Override
	public void printScore() {
		super.printScore();
		TotalDto totalDto = new TotalDto();
		
		for(ScoreDto dto : scores) {
			totalDto.kor += dto.kor;
			totalDto.eng += dto.eng;
			totalDto.math += dto.math;
			totalDto.music += dto.music;
			totalDto.art += dto.art;
			
			
		}
		System.out.print("총점 \t");
		System.out.printf("*4d\t" , totalDto.kor);
		System.out.printf("*4d\t" , totalDto.eng);
		System.out.printf("*4d\t" , totalDto.math);
		System.out.printf("*4d\t" , totalDto.music);
		System.out.printf("*4d\t" , totalDto.art);
		System.out.printf("*4d\t" , totalDto.getTotal());
		
		int stdSize = scores.size();
		System.out.println("평균\t");
		System.out.printf("%.1f\t", totalDto.getKorAvg(stdSize));
		System.out.printf("%.1f\t", totalDto.getEngAvg(stdSize));
		System.out.printf("%.1f\t", totalDto.getMathAvg(stdSize));
		System.out.printf("%.1f\t", totalDto.getMusicAvg(stdSize));
		System.out.printf("%.1f\t", totalDto.getArtAvg(stdSize));
		
		System.out.printf("%.2f\t\n", totalDto.getAvg());
		
		
	}
}
