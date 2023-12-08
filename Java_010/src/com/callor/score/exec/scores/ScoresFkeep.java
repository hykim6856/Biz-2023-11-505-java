package com.callor.score.exec.scores;

import com.callor.score.service.scoresService_keep;

public class ScoresFkeep {
	public static void main(String[] args) {

		scoresService_keep scoreService = new scoresService_keep();
		scoreService.inputScore(50,100);
		
		for(int i = 0 ; i<3; i++) {
			//3명의 학생 점수를 입력 받아 스코어서비스.스코어스에 추가 해달라
		 scoreService.inputScore(50,100);
		}
		while(true) {
			//스코어서비스.스코어스에 저장된 학생의 성적정보를 출력해달라.
			scoreService.printScore();
			break;
		}
	}
}
