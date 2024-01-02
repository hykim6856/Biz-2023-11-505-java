package com.callor.test.service;

public interface GuideService {

	public void loadGuide();
	// guide.txt 파일을 읽어 List<GuideDto> type 의 guideList 데이터에 저장
	
	public void printGuide();
	//guideList 의 데이터를 console 에 출력
}
