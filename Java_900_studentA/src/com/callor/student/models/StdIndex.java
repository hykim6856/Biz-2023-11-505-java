package com.callor.student.models;

public enum StdIndex {

	학번(0), 이름(1), 학과(2), 학년(3), 전화번호(4), 주소(5);

	public int index;

	StdIndex(int index) {
		this.index = index;
	}
}
