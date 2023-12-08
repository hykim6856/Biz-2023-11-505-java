package com.callor.score.exec.scores;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;
import com.callor.score.uitls.Line;

 
public class ScoreDA {

	public static void main(String[] args) {
		NumberService numservice = new NumberService();
		List<ScoreDto> scores = new ArrayList<ScoreDto>();
	
		int start = 50;
		int end = 100;
		
		for (int i = 0; i < 3; i++) {
			int stNum = i + 1;
			String stdNum= String.format("S%04d, i+1");
		
			int num1 = numservice.inputNumber(stNum + "번의 국어 점수를", start, end);
			int num2 = numservice.inputNumber(stNum + "번의 영어 점수를", start, end);
			int num3 = numservice.inputNumber(stNum + "번의 수학 점수를", start, end);
		
			ScoreDto scoreDto = new ScoreDto();
		
			scoreDto.stdNum= stdNum;
		
		
			
			scoreDto.kor = num1;
			scoreDto.eng = num2;
			scoreDto.math = num3;
		
			scores.add(scoreDto);

		}

		Line.dTitle("성적리스트", 50);
		System.out.println("학번\t국어\t영어\t수학\t총점\t");
		Line.sLine(50);

		int size = scores.size();
		for (int i = 0; i < size; i++) {
			ScoreDto dto = scores.get(i);
			System.out.printf("%s \t", dto.stdNum);
			System.out.printf("%3d \t", dto.kor);
			System.out.printf("%3d \t", dto.eng);
			System.out.printf("%3d \t", dto.math);
			System.out.printf("%3d \t\n", dto.getTotal());
		}
		

		for (ScoreDto dto : scores) {
			System.out.printf("%s\t",dto.stdNum);
			System.out.printf("%3d \t", dto.kor);
			System.out.printf("%3d \t", dto.eng);
			System.out.printf("%3d \t", dto.math);
			System.out.printf("%3d \t\n", dto.getTotal());
			
		}

	}

}
