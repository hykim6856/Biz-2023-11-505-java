package com.callor.student.exec;

import java.util.ArrayList;
import java.util.List;

public class ListA {

	public void findNum() {
		
	}
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 50) + 51;
			nums.add(num);
		}
		System.out.println(nums);
		int index=0;
		for (index = 0; index < nums.size(); index++) {
			if (nums.get(index)==77) {
			//	System.out.printf("%d 번째 수의 값 : %d",i,nums.get(i));
				break;
			}
			 
		}
		if(index <nums.size()) {
			
		}
	
		
	}
}
