package com.callor.score.uitls;

public class Line {
	

	public static void dLine(int length) {
		System.out.println("=".repeat(length));
	}

	public static void sLine(int length) {
		System.out.println("-".repeat(length));
	}

	public static void dTitle(String title, int length) {
		System.out.println("=".repeat(length));
		System.out.println(title);
	}
}
