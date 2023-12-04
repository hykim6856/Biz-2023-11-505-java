package com.callor.oop.exec;

public class StringB {

	public static void main(String[] args) {
		int sum = 0;
		String nums = "50,88,70,100,98";
		String[] result = nums.split(",");
		for (int i = 0; i<result.length; i++) {
			sum += Integer.valueOf(result[i]);
		}
		System.out.print(sum);
	}
}
