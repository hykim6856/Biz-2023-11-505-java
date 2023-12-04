package com.callor.oop.exec;

public class ArraysBA {
	public static void main(String[] args) {
		int[] nums = new int[45];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		// nums 배열은 개수가 45개. nums. ;length:45
		// index 의 범위는 0~44까지

		int rndN = (int) (Math.random() * nums.length);

		// 배열의 셔플 코드
		// 임의의 인덱스 값 2개를 생성하여 서로 위치 바꾸기를 100번 실행.
		for (int i = 0; i < 100; i++) {
			int index1 = (int) (Math.random() * nums.length);
			int index2 = (int) (Math.random() * nums.length);

			int _temp = nums[index1];
			nums[index1] = nums[index2];
			nums[index2] = _temp;
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d ", nums[i]);
		}

		int[] nums2 = new int[6];

		for (int i = 0; i < nums2.length; i++) {
			nums2[i] = nums[i];
		}
		for (int mainIndex = 0; mainIndex < nums2.length; mainIndex++) {
			for (int subIndex = mainIndex + 1; subIndex < nums2.length; subIndex++) {
				if (nums2[mainIndex] > nums2[subIndex]) {
					int _temp = nums2[mainIndex];
					nums2[mainIndex] = nums[subIndex];
					nums2[subIndex] = _temp;
				}

			}
		}
		System.out.println();
		for(int num: nums2) {
			System.out.printf("%d ", num);
		}

	}
}