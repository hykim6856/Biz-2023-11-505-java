package com.callor.student.models;

/*
 * private static int 학번 = 0;
 * private static int 이름 = 0;
 * 
 * StIndex 라는 배열을 선언한고
 * 각 요소를
 *  학번, 이름, 학과, 학년 ,전화번호, 주소 라는 이름으로 선언
 *  그리고 각 요소는 index라는 값을 갖는다.
 */
public enum StIndex {

	학번(0), 이름(1), 학과(2), 학년(3), 전화번호(4), 주소(5);

	private int index;

	StIndex(int index) {
		this.index = index;
	}
	public int getIndex() {
		return index;
	}
}
