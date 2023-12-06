package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.service.GuguService;
import com.callor.algorithm.utils.Line;

public class ScannerE {
	public static void main(String[] args) {
		Scanner scan = null;

		GuguService guguService = new GuguService();
		Line.dLine(50);
		int num = guguService.inputNum();

	
		guguService.printGugu(num);
	}
}
