package com.callor.oop.input;

import java.util.Scanner;

import com.callor.oop.utils.Line;

public class InputED {
	public static void main(String[] args) {
		int[] nums = new int[3];
		int i = 0;
		Scanner scan = new Scanner(System.in);

		/*
		 * while() 반복문을 사용할때 index값이 필요하면 while() 반복문 시작전에 0으로 초기화된 변수를 선언해준다. while() 문
		 * 내에서 index++ 를 실행한다.
		 */
		while (i < nums.length) {
			System.out.printf("정수 %d >> ", i + 1);
			String str = scan.nextLine();
			try {

				nums[i] = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 정확하게 입력해주세요");
				continue;
			}
			i++;
		} // end while
		Line.dLine(30);
		int sum = 0;
		for (int num : nums) {
			System.out.println(num);
			sum += num;
		}
		Line.dLine(30);
		System.out.println("합계 : " + sum);
	}// end main
}//
