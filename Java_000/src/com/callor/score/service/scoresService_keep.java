package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreDto;
import com.callor.score.uitls.Line;

public class scoresService_keep {
	Scanner scan = null;
	private	List<ScoreDto> scores = null;
	private NumberService numService = null;
	

	public scoresService_keep() {
		scan = new Scanner(System.in);

	}

	public void inputScore() {
		while (true) {
			Line.dLine(50);
			System.out.printf("%d ~ %d 범위의 정수를 입력하세요\n", 50, 100);
			System.out.print("국어 점수를 입력해주세요>>");
			String str = scan.nextLine();

			int num = 0;
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.err.println("**정수를 정확히 입력해주세요**");
				continue;
			}
			Line.sLine(50);
			return ;
		} // while
	}// end inputNumber(String title)

	public void inputScore( int start, int end) {
		scores = new ArrayList<ScoreDto>();
		numService = new NumberService();
/*
 * 점수를 저장할때 학번을 자동생성하여 저장하고 싶다. 우리의 학번은 230001 ~형식으로 만들고 싶다.
 * 
 */
	NumberService numService = new NumberService();
	
	// 스코어 리스트에 저장되어있는데이터 중 가장 마지막 요소(제일 끝 인덱스 요소)에서 학번을 가져와서
	//strStdNum 변수에 할당하라.
	/*String strStdNum="230001";
			if(scores.size()>0) {
				strStdNum = scores.get(scores.size()-1).stdNum;
			}*/
	
	
	/*
	 * 만약 스토어스 리스트에 데이터가 한개라도 있으면 마지막 요소의 학번을 str에 할당하고 그렇지 않으면 초기값인 230000을 유지하라
	 */
	String strStdNum = "230000";
	if(scores.size()>0) {
		strStdNum = scores.get(scores.size()-1).stdNum;
	}
	int intStdNum = Integer.valueOf(strStdNum.substring(2));
	intStdNum++;
	
	strStdNum = String.format("23%04d", intStdNum);
	
	int scoreKor = numService.inputNumber(strStdNum+"번의 국어 점수를",start, end);
	int scoreEng = numService.inputNumber(strStdNum + "번의 영어 점수를",start, end);
	int scoreMath = numService.inputNumber(strStdNum + "번의 수학 점수를", start , end);
	ScoreDto scoreDto = new ScoreDto();
	scoreDto.stdNum = strStdNum;
	scoreDto.kor=scoreKor;
	scoreDto.eng=scoreEng;
	scoreDto.math=scoreMath;

	}
	public void printScore() {
		ScoreDto scoreDto = new ScoreDto();
		Line.dLine(50);
		System.out.println("학번\t국어\t영어\t수학\t총점");
		Line.sLine(50);
		System.out.printf("%s\t",scoreDto.stdNum);
		System.out.printf("%d\t",scoreDto.kor);
		System.out.printf("%d\t",scoreDto.eng);
		System.out.printf("%d\t",scoreDto.math);
		System.out.printf("%d\n",scoreDto.getTotal());
		
		
	}
}
