package com.callor.hello.var;

public class VarA {
	public static void main(String[] args) {
		int num = 0;
		num = num + 20; // num 변수값을 20 증가
		num += 20;// num 변수값을 20 증가

		num = num - 20; // num 변수값을 20 감소
		num -= 20; // num 변수값을 20 감소

		// 변수 = 값 처럼 EQ(=) 가 한개 있는 명령문을 만나면 이전 코드에서 변수에 적용되었던 값들이 의미가 없어진다.
		num = 2; // 위에 무시하고 2

		num = num + 1; // num 변수값을 1 증가
		num += 1; // 1증가
		num++; // 1증가
		++num; // 1증가

		num = num - 1; // 1감소
		num -= 1;// 1감소
		num--;// 1감소
		--num;// 1감소

		num=num *3;
		num*= 3;
		num=num/ 3;
		num/=3;
		num=num %3;
		num%=3;
		
		num = num *1;
		num *= 1;
				
	}

}
