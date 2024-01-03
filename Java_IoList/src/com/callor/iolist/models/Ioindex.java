package com.callor.iolist.models;

public enum Ioindex {
	// 거래일자,거래시각,상품명,거래처명,대표자명,거래구분,수량,매입단가,매출단가

	거래일자(0), 상품명(2), 거래처명(3), 대표자명(4), 구분(5), 매입단가(7), 판매단가(8), 수량(6);

	public int index;

	Ioindex(int index) {
		this.index = index;
	}
}
