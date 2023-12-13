package com.callor.student.exec;

import com.callor.student.models.StIndex;

public class StudentExC {
	public static void main(String[] args) {
		System.out.println(StIndex.학번.getIndex());
		System.out.println(StIndex.이름.getIndex());

		// StdIndex enum 에 선언된 요소들을 배열로 변환하고 indexArray 배열에 복사하라
		StIndex[] indexArray = StIndex.values();
		// for(int i=0 ; i <indexArray.length; i++)
		for (StIndex item : indexArray) {
			System.out.printf("%d, %s \n", item.getIndex(), item);
		}
	}
}
