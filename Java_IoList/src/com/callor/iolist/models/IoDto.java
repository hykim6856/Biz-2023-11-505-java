package com.callor.iolist.models;
//거래일자,거래시각,상품명,거래처명,대표자명,거래구분,수량,매입단가,매출단가

public class IoDto {
	public String date;
//	public String time;
	public String priceName;
	public String accountName;
	public String ceoName;
	public int depart;
	public int amount;
	public int buymoney;
	public int sellmoney;

	public IoDto() {
		// TODO Auto-generated constructor stub
	}

	public IoDto(String date, String priceName, String accountName, String ceoName, int depart, int amount,
			int buymoney, int sellmoney) {
		super();
		this.date = date;
//	this.time = time;
		this.priceName = priceName;
		this.accountName = accountName;
		this.ceoName = ceoName;
		this.depart = depart;
		this.amount = amount;
		this.buymoney = buymoney;
		this.sellmoney = sellmoney;
	}

	@Override
	public String toString() {
		return "IoDto [date=" + date + ", priceName=" + priceName + ", accountName=" + accountName + ", ceoName="
				+ ceoName + ", depart=" + depart + ", amount=" + amount + ", buymoney=" + buymoney + ", sellmoney="
				+ sellmoney + "]";
	}

}
