package com.callor.hello.arrays;

public class ArraysB {

	/*
	 * 컴퓨터를 이용하여 데이터를 처리할 때는
	 * 많은 수의 데ㅣ터를 저장하고 처리해야 하는 경우가 매우 많다.
	 * 단순한 변수를 선언 하여 처리하는 것은 배우 비효율적이다.
	 * 이때 언어에서는 "배열"이라는 특별한 변수 type 을 사용할 수 있다.
	 */
	public static void main(String[] args) {
		/*
		 * int [] nums : nums 라는 정수형 배열을 선언한다
		 * =new int [5] : nums 라는 배열은 박스가 5개다
		 * 
		 * 정수형 배열 5개를 선언한다
		 * 요소개수가 5개인 정수형 배열을 선언한다
		 */
		int[] nums = new int [5];
		//각각의 요소에 값을 할당하기
		nums[3] = 30; 
		nums[0] = 20; 
		nums[2] = 10;
		nums[1] = 100;
		nums[4] = 5;
		//nums[5] = 0; <-5개 생성이 되었는데 0~4까지라서 성립안됨.
		
		
		//nums 배열의 3번 index 위치에 저장된 값을 출력
		System.out.println(nums[3]);
		
	}
}
