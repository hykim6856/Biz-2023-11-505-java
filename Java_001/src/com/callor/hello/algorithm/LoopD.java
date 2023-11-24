package com.callor.hello.algorithm;

public class LoopD {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < (i + 1); j++) {
				System.out.print("* ");

			}
			System.out.println();
		}
		System.out.println("=======================================");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < (10-i ); j++) {
				System.out.print("* ");

			}
			System.out.println();
		}
	}
}
