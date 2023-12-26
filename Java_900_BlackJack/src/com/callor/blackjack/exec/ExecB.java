package com.callor.blackjack.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.blackjack.models.CardDto;

public class ExecB {

	public static void main(String[] args) {

		List<CardDto> cardList = new ArrayList<CardDto>();
		String strSuit = "◆♤♣♡";
		String strDenomi = "A234567890KQJ";

		//1글자씩 나누란 의미
		String[] suits = strSuit.split("");
		String[] denomis = strDenomi.split("");

		for(String suit : suits) {
			for(String deno: denomis) {

				int value = 0;

				try {
					value = Integer.valueOf(deno);

				} catch (Exception e) {

					//deno 값이 알파벳일 경우 오류 발생
					if(deno.equals("A")) value = 1;
					else value = 10;

					// TODO: handle exception
				}
				if(value==0) value = 10;
				//System.out.printf("%s,%s,%d",suit,deno,value);

				CardDto cardDto = new CardDto();
				cardDto.suit = suit;
				cardDto.denomiation = deno;
				cardDto.value = value;

				cardList.add(cardDto);

			}

		}

	}

}