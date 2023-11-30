package com.callor.oop.input;

import java.util.Scanner;

public class InputE {
	public static void main(String[] args) {
		int repeat = 3;
		int i = 0;
		int[] nums = new int[repeat];

		String[] str = new String[repeat];
		Scanner scan = new Scanner(System.in);

		while (i < repeat) {

			System.out.printf("정수 %d 입력>> ", i + 1);
			str[i] = scan.nextLine();
			// ====================================
			try {
				nums[i] = Integer.valueOf(str[i]);

			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println("정수값을 정확히 입력해야합니다.");
				continue;
			}
			// ======================================================
			// nums[i] = Integer.valueOf(str[i]);
			// System.out.printf("nums [%d] 에 저장된 값 %d\n", i, nums[i]);

			i++;
		}
		System.out.println("=".repeat(50));
		for (int index = 0; index < repeat; index++) {
			System.out.print(nums[index] + "\n");
		}

	}
}
