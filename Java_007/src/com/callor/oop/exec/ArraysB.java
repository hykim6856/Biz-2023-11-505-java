package com.callor.oop.exec;

public class ArraysB {
	public static void main(String[] args) {
		int[] nums = new int[45];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i+ 1;
		}
		//for (int num : nums) {
			//System.out.printf("%d ", num);
		//}
		/*
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					nums[i] = nums[i] + nums[j];
					nums[j] = nums[i] - nums[j];
					nums[i] = nums[i] - nums[j];
				}
			}
		}*/

		System.out.println();
		for (int num : nums) {

			System.out.printf("%d ", num);
		}
	}
}