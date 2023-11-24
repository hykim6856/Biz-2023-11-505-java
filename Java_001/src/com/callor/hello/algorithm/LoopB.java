package com.callor.hello.algorithm;

public class LoopB {

	public static void main(String[] args) {
		int count = 0;
		for (int index = 0; index < 100; index++) {
			System.out.print("* ");
			// 별을 출력할때마다 count 를 1씩 증가시키고
			count++;
			// 카운트가 10을 넘어가면 엔터와 함께 카운트를 다시 초기화
			if (count >= 10) {
				System.out.println();
				count = 0;
				// 10개의 별을 출력한 후 줄바꿈 (Enter) 를 해주면 됨

			}
		}

		System.out.println("======================");
		for (int index = 0; index < 100; index++) {
			System.out.print("* ");{
				if ((index + 1) % 10 == 0) {
					System.out.println();
				}
			}
		}
	}
}
