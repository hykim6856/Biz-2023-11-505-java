package com.callor.algorithm.exec;

import com.callor.algorithm.utils.Line;

public class NumbersA {
public static void main(String[] args) {
	int i= 1;
	Line.dLine(70);
	while (true) {
		System.out.printf("%d\t", i++);
		if (i>10) {
			break;
		}
	}
	System.out.println();
	Line.dLine(70);
}
}
