package com.callor.score.exec.scores;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;
import com.callor.score.utils.Line;

public class ScoreD {
	public static void main(String[] args) {
		NumberService numservice = new NumberService();
		List<ScoreDto> scoers = new ArrayList<ScoreDto>();
		
		int start = 50;
		int end = 100;
		String stdNum = "";
		
		for (int i = 0; i < 3; i++) {
			stdNum = String.format("S%05d", i + 1);
			int scoreKor = numservice.inputNumber(stdNum + "번의 국어 점수", start, end);
			int scoreEng = numservice.inputNumber(stdNum + "번의 영어 점수", start, end);
			int scoreMath = numservice.inputNumber(stdNum + "번의 수학 점수", start, end);
			
			ScoreDto scoreDto = new ScoreDto();
			scoreDto.kor = scoreKor;
			scoreDto.eng = scoreEng;
			scoreDto.math = scoreMath;
			
			scoers.add(scoreDto);
		}
		Line.dLine(40);
		System.out.println("성적 리스트");
		Line.dLine(40);
		System.out.println("학번\t국어\t영어\t수학\t총점");
		Line.sLine(40);
		stdNum = "";
		for (int i = 0; i < scoers.size(); i++) {
			ScoreDto Dto = scoers.get(i);
			stdNum = String.format("S%05d", i + 1);
			System.out.printf("%s\t",stdNum);
			System.out.printf("%3d\t",Dto.kor);
			System.out.printf("%3d\t",Dto.eng);
			System.out.printf("%3d\t",Dto.math);
			System.out.printf("%3d\n",Dto.getTotal());
		}
		Line.dLine(40);
	}

}
