package com.callor.iolist.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.iolist.models.IoDto;
import com.callor.iolist.models.Ioindex;
import com.callor.iolist.service.IoService;
import com.callor.iolist.utils.Line;

public class IoServiceImplV1 implements IoService {

	private List<IoDto> ioList = null;
	private String ioFile = null;

	public IoServiceImplV1() {
		ioList = new ArrayList<IoDto>();
		ioFile = "src/매입매출데이터.txt";
	}

	@Override
	public void loadIoService() {
		InputStream is = null;
		Scanner readFile = null;

		try {
			is = new FileInputStream(this.ioFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		readFile = new Scanner(is);
		while (readFile.hasNext()) {
			String line = readFile.nextLine();
			String[] ios = line.split(",");
			IoDto dto = new IoDto(
					ios[Ioindex.거래일자.index], ios[Ioindex.상품명.index], 
					ios[Ioindex.거래처명.index], ios[Ioindex.대표자명.index], 
					Integer.valueOf(ios[Ioindex.구분.index]),Integer.valueOf(ios[Ioindex.수량.index]), 
					Integer.valueOf(ios[Ioindex.매입단가.index]),Integer.valueOf(ios[Ioindex.판매단가.index]));
			ioList.add(dto);
		}
		readFile.close();
		// for(IoDto dto : ioList) { System.out.println(dto); }
	}

	@Override
	public void printIoService() {
		Line.dLine(100);
		System.out.println("거래일자\t거래처\t\t\t\t\t상품이름\t매입금액\t판매금액");
		Line.sLine(100);
		for (IoDto dto : ioList) {
			System.out.printf("%s\t", dto.date);
			System.out.printf("%s\t\t\t", dto.accountName);
			System.out.printf("%s\t\t\t", dto.priceName);
			if (dto.depart == 1) {
				System.out.printf("%s\t\t", dto.buymoney * dto.amount);

			} else {
				System.out.printf("0\t\t");
			}
			if (dto.depart == 2) {
				System.out.printf("%s\n", dto.sellmoney * dto.amount);
			} else {
				System.out.println("0");
			}
		}
		Line.sLine(100);
	}

}
