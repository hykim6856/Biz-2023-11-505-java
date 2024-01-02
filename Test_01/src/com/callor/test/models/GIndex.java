package com.callor.test.models;

public enum GIndex {

	id(0), 종목명(1), 순번(2), 가이드(3);

	public int index;

	GIndex(int index) {
		this.index = index;
	}
}
