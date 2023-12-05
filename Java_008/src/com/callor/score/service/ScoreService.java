package com.callor.score.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import com.callor.score.model.ScoreDto;
import com.callor.score.utils.Line;

public class ScoreService {

	//변수의 스코프가 클래스 영역이다.
	//이 변수는 ScoreService 클래스의 소유이다.
	//class 영역에는 여러가지 method 들이 있다.
	private ScoreDto[] scores = null;
	private Scanner scan = null;

	/*
	 * 생성자 method(Constructor) 클래스를 사용하여 객체를 선언하고 객체를 사용하기 위하여 초기화 할때 호출 (실행)하는
	 * method
	 * 
	 * 클래스 이름과 같고 (첫글자 대문자), return type이 없다. static 도 붙일 수 없다.
	 * 
	 * 보통은 비어있는(blank) 코드가 자동으로 생성되지만 필요에따라 변수, 객체 등을 만드는 코드를 추가 할 수 있다.
	 */
	public ScoreService() {
		String dataFile = "src/com/callor/score/service/data.txt";
		InputStream is = null;
		try {
			is = new FileInputStream(dataFile);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		scan = new Scanner(is);
		scores = new ScoreDto[100];

	}// end scoreservice method

	// data.txt 파일에서 성적을 읽어 score배열에 저장하기
	// 생성자에서 이미 data. txt파일을 오픈하고 읽어들일 준비가 되어있다.
	// 생성자에서 만들어둔 스캔 객체를 사용하여 데이터를 읽고 처리를 수행하면된다.
	public void loadScores() {
		int index = 0;
		while (scan.hasNext()) {
			String line = scan.nextLine();
			// System.out.println(line);
			// 읽어딜인 한 라인의 데이터를 각 항목별로 분해하여 라인스 배열에 담기
			String[] lines = line.split(",");

			ScoreDto scoreDto = new ScoreDto();
			
			scoreDto.stdnum = lines[0];

			scoreDto.kor = Integer.valueOf(lines[1]);
			scoreDto.eng = Integer.valueOf(lines[2]);
			scoreDto.math = Integer.valueOf(lines[3]);
			scoreDto.music = Integer.valueOf(lines[4]);
			scoreDto.art = Integer.valueOf(lines[5]);
			scoreDto.sw = Integer.valueOf(lines[6]);
			scoreDto.db = Integer.valueOf(lines[7]);

			scores[index++] = scoreDto;
		}

	}//end load
	
	/*
	 * loadScores 메소드가 데이터 텍스트 파일에서 학생의 성적 데이터를 읽어서 스코어 배열에 저장해둔 상태 
	 * score 배열에 저장된 데이터를 화면에 성적표로 출력하기
	 */

	public void printScores() {
		Line.dLine(90);
		System.out.println("학번\t국어\t영어\t수학\t음악\t미술\tsw\tdb\t총점\t평균");
		Line.dLine(90);

		//scores 의 타입이 무엇인가?
		//scores 라는 배열을 선언할때 어떤 명령(도구)를 사용하여 선언했는가?
		//scoreDto[] 를 사용하여 score 를 선언했다.=scores 는 ScoreDto 배열 type 이다
		//scores[index] 의 type 은 무엇인가.(scores 배열의 개별요소의 type 이 무엇인가?_)
		//scores 개별요소의 type ScoreDto
		for (int i = 0; i < scores.length; i++) {
			//변수를 만들어 쓰는 방법 scoreDto scoreDto = scores[i]
			ScoreDto scoreDto = scores[i];
			System.out.printf("%s\t", scores[i].stdnum);
			System.out.printf("%3d\t", scoreDto.kor);
			System.out.printf("%3d\t", scoreDto.eng);
			System.out.printf("%3d\t", scoreDto.math);
			System.out.printf("%3d\t", scoreDto.music);
			System.out.printf("%3d\t", scoreDto.art);
			System.out.printf("%3d\t", scoreDto.sw);
			System.out.printf("%3d\t", scoreDto.db);
			System.out.printf("%3d\t", scoreDto.getTotal());
			System.out.printf("%5.2f\n", scoreDto.getAvg());
			
			
		}
	

	}//end print Score()
}
