package com.callor.score.exec;

public class StringA {
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			int num = i + 1;
			
			//정수를 사용하여 규격에 맞는 학번을
			// code 로 만들고자 한다
			// 하지만 printf() 는 return type 이 void 이어서
			// 결과값을 변수에 할당할 수 없다
			// String stNum = System.out.printf("S%05d\n",num);
			
			String stNum = String.format("S%05d", num);
			System.out.println(stNum);
		}
	}
	

}
