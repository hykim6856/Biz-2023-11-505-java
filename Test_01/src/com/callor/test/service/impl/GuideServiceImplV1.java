package com.callor.test.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.test.models.GIndex;
import com.callor.test.models.GuideDto;
import com.callor.test.service.GuideService;
import com.callor.test.utils.Line;

public class GuideServiceImplV1 implements GuideService {

	private List<GuideDto> guideList = null;
	private String guideFile = null;

	public GuideServiceImplV1() {
		guideFile = "src/guide.txt";
		guideList = new ArrayList<GuideDto>();
	}

	@Override
	public void loadGuide() {
		InputStream is = null;
		Scanner fileRead = null;

		try {
			is = new FileInputStream(this.guideFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(this.guideFile + "파일을 찾을 수 없음");
			return;
		}

		fileRead = new Scanner(is);
		while (fileRead.hasNext()) {
			String line = fileRead.nextLine();

			String[] guides = line.split(",");
			GuideDto dto = new GuideDto(guides[GIndex.id.index], guides[GIndex.종목명.index], guides[GIndex.순번.index],
					guides[GIndex.가이드.index]);
			guideList.add(dto);

		}
		fileRead.close();
		/*
		 * for(GuideDto dto : guideList) { System.out.println(dto); }
		 */
	}

	@Override
	public void printGuide() {
		Line.dLine(100);
		System.out.println(" id \t 종목명 \t 순서 \t 방법");
		String id = null;
		for (GuideDto dto : guideList) {
//			System.out.println(id);
//			System.out.println(dto.id);
//			System.out.println(dto.id.equals(id));
			if(dto.id.equals(id)==false) {
				Line.sLine(100);
			}
			id = dto.id;
			System.out.printf("%s \t", dto.id);
			System.out.printf("%s \t", dto.list);
			System.out.printf("%s 회 \t", dto.seq);
			System.out.printf("%s \t\n", dto.guide);
		}//end for
		Line.dLine(100);
	}

}
