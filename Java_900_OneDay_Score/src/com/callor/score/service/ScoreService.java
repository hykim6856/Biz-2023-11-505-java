package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.utils.Line;

public class ScoreService {
	// 선언
	private List<ScoreDto> scores = null;

	// 생성자에서 초기화
	public ScoreService() {
		scores = new ArrayList<ScoreDto>();
	}

	// 랜덤한 성적 만들기
	public void creScore(int stdNum) {

		for (int i = 0; i < stdNum; i++) {
			String strStdNum = "230000";
			if (scores.size() > 0) {
				strStdNum = scores.get(scores.size() - 1).stdNum;
			}
			int intStdNum = Integer.valueOf(strStdNum.substring(2));
			intStdNum++;

			strStdNum = String.format("23%04d", intStdNum);

			int scoreKor = (int) (Math.random() * 50) + 51;
			int scoreEng = (int) (Math.random() * 50) + 51;
			int scoreMath = (int) (Math.random() * 50) + 51;
			int scoreMusic = (int) (Math.random() * 50) + 51;
			int scoreArt = (int) (Math.random() * 50) + 51;

			ScoreDto scoreDto = new ScoreDto();
			scoreDto.stdNum = strStdNum;
			scoreDto.kor = scoreKor;
			scoreDto.eng = scoreEng;
			scoreDto.math = scoreMath;
			scoreDto.music = scoreMusic;
			scoreDto.art = scoreArt;

			scores.add(scoreDto);
		}
	}

	// 성적표 출력하기
	public void printScore() {
		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		int musicSum = 0;
		int artSum = 0;
		int sumSum = 0;
		float avgAvg = 0;

		float korAvg = 0;
		float engAvg = 0;
		float mathAvg = 0;
		float musicAvg = 0;
		float artAvg = 0;

		int stdNum = 0;

		Line.dLine(80);
		System.out.println("* 한울 고교 성적 리스트 *");
		Line.dLine(80);
		System.out.println(" 학번\t\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		Line.sLine(80);
		for (ScoreDto dto : scores) {

			System.out.printf(" %s\t\t", dto.stdNum);
			System.out.printf("%3d\t", dto.kor);
			System.out.printf("%3d\t", dto.eng);
			System.out.printf("%3d\t", dto.math);
			System.out.printf("%3d\t", dto.music);
			System.out.printf("%3d\t", dto.art);
			System.out.printf("%3d\t", dto.getTotal());
			System.out.printf("%5.2f\n", dto.getAvg());

			korSum += dto.kor;
			engSum += dto.eng;
			mathSum += dto.math;
			musicSum += dto.music;
			artSum += dto.art;
			sumSum += dto.getTotal();
		}
		stdNum = scores.size();// 학생 수
		korAvg = (float) korSum / stdNum;
		engAvg = (float) engSum / stdNum;
		mathAvg = (float) mathSum / stdNum;
		musicAvg = (float) musicSum / stdNum;
		artAvg = (float) artSum / stdNum;

		float avgSum = korAvg + engAvg + mathAvg + musicAvg + artAvg;
		avgAvg = avgSum / 5;

		Line.sLine(80);
		// 총점 : 국어, 영어, 수학, 음악, 미술, 총 총점. 각각 구하기
		System.out.printf(" 총점\t\t");
		System.out.printf("%3d\t", korSum);
		System.out.printf("%3d\t", engSum);
		System.out.printf("%3d\t", mathSum);
		System.out.printf("%3d\t", musicSum);
		System.out.printf("%3d\t", artSum);
		System.out.printf("%3d\t", sumSum);
		System.out.printf("\n");
		// 평균 : "
		System.out.printf(" 평균\t\t");
		System.out.printf("%5.2f\t", korAvg);
		System.out.printf("%5.2f\t", engAvg);
		System.out.printf("%5.2f\t", mathAvg);
		System.out.printf("%5.2f\t", musicAvg);
		System.out.printf("%5.2f\t", artAvg);
		System.out.printf("\t%5.2f\t", avgAvg);
		System.out.printf("\n");
		Line.dLine(80);
	}
}
