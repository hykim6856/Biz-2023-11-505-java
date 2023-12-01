package com.callor.oop.keyboard;

import java.util.Scanner;

public class KeyBoardC {

	public static void main(String[] args) {
		int RANGE = 10;
		int life = 5; 

		Scanner scan = new Scanner(System.in);
		int answer = (int) (Math.random() * RANGE) + 1;
		
		//-----------
		
		int num = 0;
		int tryN = 0;
		//------------
		System.out.println("=".repeat(50));
		System.out.printf("<<%d번 안에 1 부터 %d까지의 랜덤한 수를 맞춰보세요>>\n",life, RANGE);
		System.out.println("=".repeat(50));
		
		//======================================================
		while (true) {
			System.out.print("정수입력(QUIT 종료) >> ");
			String str = scan.nextLine();
			//======================================================
			if (str.equals("QUIT")) {
				System.out.println("종료");
				break;
				//======================================================
			}
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println();
				System.out.printf("<!!오류!!>\n (%s)를 입력하셨습니다. ", str);
				System.out.println("정수를 정확히 입력해주세요! ");
				System.out.println();
				System.out.println("-".repeat(50));
				continue;
			}
//--
			if (num > RANGE || num < 1) {
				System.out.println();
				System.out.printf("<!!오류!!>\n %d 은 범위 안의 수가 아닙니다. 1부터 %d 까지의 정수를 입력해주세요! \n", num, RANGE);
				System.out.println();
				System.out.println("-".repeat(50));
				continue;
			}
			if(life-tryN==1&&num!=answer) {
				System.out.println("남은 횟수 : " +0 );
				System.out.println("Gameover");
				System.out.println("정답 : "+answer);
				System.out.println("=".repeat(50));
				break;
			}
			//======================================================
			if (num > answer) {
				System.out.println();
				System.out.printf("!HINT! : 입력하신 %d 보다 작아요\n", num);
			}else if (num < answer) {
				System.out.println();
				System.out.printf("!HINT! : 입력하신 %d 보다 커요\n", num);
			}else {
				tryN += 1;
				System.out.printf("[ %d 번째 시도만에 클리어 ]\n",tryN);
				System.out.printf("정답은 %d!\n", num);
				System.out.println("참잘했어요 :)");
				System.out.println("=".repeat(50));
				return;}
			//======================================================
			tryN += 1;
			System.out.printf("[ %d 번째 시도, 남은 횟수 : %d ]\n",tryN, life-tryN);
				System.out.println("다시 시도해보세요 :(");
				System.out.println();
				System.out.println("-".repeat(50));
				
				continue;
				//--
			}//end while

		}//end main

	}

