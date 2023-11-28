package com.callor.hello.method;

public class methodJ {

	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 100) + 2;
			if (isEven(num)==true) {
				System.out.printf("%d 는 짝수이다.\n", num);
			}else {
				System.out.printf("%d 는 짝수가 아니다.\n", num);
			}
		}
	}
}
