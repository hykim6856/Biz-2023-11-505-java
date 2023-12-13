package com.callor.student.models;

public enum MenuIndex {

	학생정보_입력(1), 학생정보_조회(2), 학생정보_가져오기(3), 학생정보_출력(4);
	
	private int index;
	MenuIndex(int index){
		this.index = index;
	}
	public int getIndex() {
		return index;
	}
}
