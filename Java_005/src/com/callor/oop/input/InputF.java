package com.callor.oop.input;

import java.util.Scanner;

public class InputF {
	public static boolean Range(int num) {
		  if (num >= 2 && num <= 10) {
	            return true;
	        } else {
	        	return false;
	        }
	}
	public static void main(String[] args) {
	
		int num = 0;

		Scanner scan = new Scanner(System.in);
		String str = "";
		while (true) {
			
			
			System.out.print("정수(2~10)입력 (QUIT:끝내기)>> ");
			str = scan.nextLine();
			
			if(str.equals("QUIT")) {
				System.out.println("종료");
				break;
			}
			// ====================================
			try {
				num= Integer.valueOf(str);
				
			} catch (Exception e) {
				// e.printStackTrace();
				System.err.println("정수값을 정확히 입력해야합니다.");
				continue;
			}
			if(Range(num)==true) {
				if(num %2 !=0 ) { 
				System.out.printf("%d 는 짝수가 아닙니다.\n",num);
				continue;
			}else {
				System.out.printf("%d 는 짝수입니다.\n",num);
				continue;
			}
			}else {
			System.err.println("2부터 10까지 범위의 정수이어야합니다.");
			continue;
			}
		
		
			
		
		}

	}
}
