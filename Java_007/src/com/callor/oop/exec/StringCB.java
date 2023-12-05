package com.callor.oop.exec;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class StringCB {
	public static void main(String[] args) {
		String dataFile = "src/com/callor/oop/exec/data.txt";
		Scanner scan = null;
		InputStream is = null;
		//
		try {
			is = new FileInputStream(dataFile);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(dataFile+"파일을 찾을 수 없음");
		}

		scan = new Scanner(is);
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] scores = line.split(",");
		
			int sum = 0;
			for (int i = 1; i < scores.length; i++) {
					sum += Integer.valueOf(scores[i]);
				
			}

			for (int i = 1; i < 2; i++) {
				System.out.printf(line);
				System.out.printf("   %s 번 총점 : %d\n",scores[0],sum);

			}
		}
		scan.close();
	}
}
