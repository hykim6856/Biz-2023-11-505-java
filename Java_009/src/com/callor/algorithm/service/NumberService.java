package com.callor.algorithm.service;

import java.util.Scanner;

import com.callor.algorithm.utils.Line;

public class NumberService {
	//현재 클래스의 여러 메소드에서 스캐너를 이용하여 키보드 입력을 받아야한다.
	//Scanner scan = null 코드에 의해 스캐너를 선언했다.
	//하지만 아직 사용할 준비가 되지 않아 scan.nextLine 등의 코드를 실행하면 nullpointerException 이 발생한다.
	// 익셉션 발생을 방지하기 위해 scan.nextLine 코드를 실행하기 전에 
	//스캔초기화 코드 scan = new Scanner(System.in) 를 사용하여 스캔을 사용할 준비를 해주어야한 다.
	//하지만 각각의 메소드에서 스캔 초기화 코드를 사용하면 코드의 중복이 발생하고, 여러번 키보드를 연결, 단절하는 현상이 발생한다.
	
	//이럴때는 현재 클래스 KeyInputService 의 생성자 메소드에서 스캔 초기화 코드를 사용해야한다.
	Scanner scan = null;
	public NumberService() {
		scan = new Scanner(System.in);
		
	}
	public int inputNum(String title) {
		System.out.print(title + "입력해주세요>>");
		String str = scan.nextLine();
		
		int num = 0 ; 
		try {
			num = Integer.valueOf(str);
		} catch (Exception e) {
			System.out.println("정수를 정확히 입력해주세요.");
		}
		return num;
	}
	public void printAlgebra(int num1, int num2) {
		Line.sLine(50);
		System.out.printf("%d + %d = %d \n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d \n", num1, num2, num1 - num2);
		System.out.printf("%d x %d = %d \n", num1, num2, num1 * num2);
		System.out.printf("%d ÷ %d = %d \n", num1, num2, num1 / num2);
		System.out.printf("%d MOD %d = %d \n", num1, num2, num1 % num2);
		Line.dLine(50);
	}
}
