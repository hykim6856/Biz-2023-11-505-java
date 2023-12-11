package com.callor.student.exec;

import java.util.ArrayList;
import java.util.List;

public class ListA2 {
	public static List<Integer> nums = null;

	public static boolean findNum() {
		for (int i = 0; i < 10; i++) {
			if (nums.get(i) == 77) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		nums = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 50) + 51;
			nums.add(num);
		}
		System.out.println(nums);
		boolean result = false;
		if (result) {
			result = findNum();
			System.out.println("없음");
		} else {
			System.out.printf("있음");
		}
	}
}
