package com.callor.score.exec;

import com.callor.score.uitls.AnsiConsol;

public class StringB {

	public static void main(String[] args) {
		String str1 = AnsiConsol.GREEN("대한");
		String str2 = AnsiConsol.BLUE("민국");
		String str3 = AnsiConsol.CYAN("만세");
		

		System.out.println(str1);
	}
}
