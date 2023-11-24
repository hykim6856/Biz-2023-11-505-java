package com.callor.hello.algorithm;

public class LoopJ {

	public static void main(String[] args) {
		int sum = 0; //sum 변수를 어디에서 선언할 것인가
		for (int i = 0; i < 10; i++) {//i는 10이 될때까지 반복해서 나온다.
			System.out.println(i+1);
			//sum =sum+(i+1)
			sum += (i + 1); 
			/*
			 * for문을 풀어서 쓰면 
			 *s = s + (i + 1); 
			 *s = s + (i + 1); 
			 *s = s + (i + 1); 
			 *s = s + (i + 1); 
			 *s = s + (i + 1); 
			 *차근차근히 for문에 적힌 조건에 달성할때까지 반복됨.
			 * sum 변수를 for문 안에 넣어버리면 반복될때마다 초기화 되므로 for문 밖에 둘것. 
			 */
		}
		System.out.println(sum);
		//결과 출력을 어디에서 할것인가..
	}
}

