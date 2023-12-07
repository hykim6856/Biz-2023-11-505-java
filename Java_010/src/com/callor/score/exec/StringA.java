package com.callor.score.exec;

public class StringA {

	public static void main(String[] args) {
		for(int i = 0 ; i < 10 ; i ++) {
			int num = i +1;
			//String stNum = System.out.printf("S%05d\n", num);
			//정수를 사용하여 규격에 맞는 학번을 code로 만들고 자 한다.
			//하지만 printf()는 return 타입이 void라서
			//결과 값을 변수에 할당할 수 없다.
			
			String strNum = String.format("S%05d", num);
			System.out.println(strNum);
			
			
		}
	}
}
