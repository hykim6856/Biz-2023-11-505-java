package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.service.NumberService;

public class ScannerBC {
public static void main(String[] args) {
	Scanner scan = null;
	
	NumberService keyService = new NumberService();
	
	int num1 = keyService.inputNum("첫번째 정수를");
	int num2 = keyService.inputNum("첫번째 정수를");
	
	System.out.printf("%d + %d = %d \n", num1, num2, num1 + num2);
	System.out.printf("%d - %d = %d \n", num1, num2, num1 - num2);
	System.out.printf("%d x %d = %d \n", num1, num2, num1 * num2);
	System.out.printf("%d ÷ %d = %d \n", num1, num2, num1 / num2);
	System.out.printf("%d MOD %d = %d \n", num1, num2, num1 % num2);
}
}
