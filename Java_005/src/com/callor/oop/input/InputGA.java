package com.callor.oop.input;

import java.util.Scanner;

import com.callor.oop.utils.Line;

public class InputGA {
	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int lineLength = 50;
		Scanner scan = new Scanner(System.in);
		int num = 0;

		// 멈추고싶을때까지 계속 반복하기
		while (true) {
			Line.dLine(lineLength);
			System.out.println("소수찾기 프로젝트");
			Line.dLine(lineLength);
			System.out.print("정수(2~)입력 (QUIT:끝내기)>> ");
			// 키보드에서 입력되기를 기다리다가 입력이 완료되면 엔터를 눌러서 입력된 문자열을 str 변수에 할당

			String str = scan.nextLine();

			if (str.equals("QUIT")) {
				break;
			}
//입력된 문자열을 먼저 정수로 변환하기
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수로 정확히 입력해주세요");
				System.out.printf("입력한 값 (%s)\n", str);
				// 다시 while로 점프
				continue;

			}
			// 정수로 정확히 입력했구나
			// 값의 유효성검사 (2이상의 정수가 입력되었나?)
			if (num <= 2) {
				System.out.println("2이상의 정수를 입력해야합니다.");
				System.out.printf("입력한 값 %d\n", num);
			}
			
			if (isPrime(num)) {
				System.out.println(num + "는 소수이다.");
			}else {
				System.out.println(num + "가 아니다");
			}
		}
		System.out.println("소수찾기 프로젝트를 종료합니다.");

		// ====================================
		/*
		 * String str = "";
		 * 
		 * 
		 * str = scan.nextLine();
		 * 
		 * if (str.equals("QUIT")) { System.out.println("종료"); break; } try { num =
		 * Integer.valueOf(str);
		 * 
		 * } catch (Exception e) { // e.printStackTrace();
		 * System.out.println("정수값을 정확히 입력해야합니다."); continue; } if (Range(num) == false)
		 * { System.out.println("2이상의 정수이어야합니다."); continue; } if(isPrime(num)==true) {
		 * System.out.printf("%d 는 소수입니다.\n" ,num); }else {
		 * System.out.printf("%d 는 소수가 아닙니다.\n" ,num); } if (num % 2 != 0) {
		 * System.out.printf("%d 는 짝수가 아닙니다.\n", num); continue; } else {
		 * System.out.printf("%d 는 짝수입니다.\n", num); continue; }
		 * 
		 * }
		 */

	}
}
