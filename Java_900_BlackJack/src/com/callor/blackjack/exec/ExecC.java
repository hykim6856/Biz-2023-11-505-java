package com.callor.blackjack.exec;

import java.util.Scanner;

import com.callor.blackjack.service.CardService;
import com.callor.blackjack.service.impl.CardServiceImplV1;

public class ExecC {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		CardService cardService = new CardServiceImplV1();

		// cardService.makeCardDeck();
		while (true) {
			cardService.getCardDeck();
			System.out.println("아무키나 누르세요");
			scan.nextLine();
		}
	}

}