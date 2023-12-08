package com.callor.score.exec.scores;

import java.util.List;
import java.util.ArrayList;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;
import com.callor.score.uitls.Line;

/*
 * 여러명의 학생 성적 데이터를 변수에 저장하고 처리하기
 * 
 * 데이터 소스(키보드 입력, random(), file 에서 읽기) 를
 * 가지고 정보처리를 하기 위해서는 먼저 각 학생 개인의 점수를 dto 객체에 담고 
 * Dto 객체에 담긴 학생 개인의 점수를 List 객체에 추가한다.
 */
public class ScoreCA {

	public static void main(String[] args) {
		NumberService numservice = new NumberService();
		// scores 의 type 은 List
		// scores 의 요소들의 type ScoreDto
		// ScoreDto 가 여러개 포함될 리스트 변수
		// 아직은 요소가 0인 리스트 생성
		List<ScoreDto> scores = new ArrayList<ScoreDto>();

		int start = 50;
		int end = 100;

		for (int i = 0; i < 3; i++) {
			int stNum = i + 1;
			// 키보드로 입력받은 데이터를
			int num1 = numservice.inputNumber(stNum + "번의 국어 점수를", start, end);
			int num2 = numservice.inputNumber(stNum + "번의 영어 점수를", start, end);
			int num3 = numservice.inputNumber(stNum + "번의 수학 점수를", start, end);

			// Dto 객체의 각 요소에 점수를 할당하고
			ScoreDto scoreDto = new ScoreDto();
			scoreDto.kor = num1;
			scoreDto.eng = num2;
			scoreDto.math = num3;
			// List 객체에 추가하기
			scores.add(scoreDto);

		}

		Line.dTitle("성적리스트", 50);
		System.out.println("국어\t영어\t수학\t총점\t");
		Line.sLine(50);

		for (int i = 0; i < scores.size(); i++) {
			ScoreDto dto = scores.get(i);

			System.out.printf("%3d \t", dto.kor);
			System.out.printf("%3d \t", dto.eng);
			System.out.printf("%3d \t", dto.math);
			System.out.printf("%3d \t\n", dto.getTotal());
		}

	}

}
