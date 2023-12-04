package com.callor.oop.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class StringC {
	public static void main(String[] args) {
		String dataFile = "src/com/callor/oop/exec/data.txt";
		Scanner scan = null;
		InputStream is = null;
		/*
		 * ...data.txt 파일을 읽어서 무언가 처리를 하려고한다. 자바에서 파일을 읽어서 뭔가 처리를 하려면 먼저 파일을 오픈해야한다. 이때
		 * 파일을 오픈 하는 도구중에 파일 인풋스트림이라는 도구를 사용할 것이다. 그런데 파일을 오픈 하는 과정에서 어떠한 이유로든지 오픈하고자 하는
		 * 파일이 없거나 갑자기 사라져 오류를 일으킬수 있다. 때문에 자바에서 파일은 오픈하는 명령을 사요하는 코드에서는 반드시 트라이 캐치 명령을
		 * 사용하여 익셉션 예방을하도록 강제하고있다.
		 */
		try {
			is = new FileInputStream(dataFile);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		scan = new Scanner(is);

		// 오픈한 데이터 txt 파일에 대한 정보를 스캐너와 연결해주기
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String nums = line;

			// result에 각각 나뉜 정수를 할당
			String[] result = nums.split(",");
			// 각합계를 넣을 배열 만들기
			int[] sum = new int[result.length];

			// 각 배열에 7과목을 정수로 변환하여 합계도출
			for (int i = 1; i < result.length; i++) {
				for (int j = 1; j < result.length; j++) {
				sum[i] += Integer.valueOf(result[j]);
			}}
			//각 라인과 합계 출력
				System.out.printf(line);
				for (int i = 1; i < 2; i++) {
				System.out.println(sum[i]);
			}
		}
		scan.close();
	}
}
