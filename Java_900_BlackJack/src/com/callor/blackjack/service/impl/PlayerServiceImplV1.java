package com.callor.blackjack.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.blackjack.models.CardDto;
import com.callor.blackjack.service.PlayerService;

public class PlayerServiceImplV1 implements PlayerService{

	protected List<CardDto> myCardList =null;
	protected String playerName = "";


	//생성하면
	//플레이어 이름에 딜러라는 값을 할당하라

	public PlayerServiceImplV1() {
		//v1(딜러) 처럼 호출하기
		this("딜러");

		// TODO Auto-generated constructor stub
	}

	public PlayerServiceImplV1(String playerName) {


		myCardList = new ArrayList<CardDto>();
		this.playerName = playerName;

			// TODO Auto-generated constructor stub
		}



	@Override
	public void hit(CardDto card) {
		// TODO Auto-generated method stub
		myCardList.add(card);

	}

	@Override
	public void showCard() {
		for(CardDto dto : myCardList) {
			for(String p : dto.getPatterns()) {
			System.out.println(p);
			}
		}


	}

	@Override
	public int getScore() {
		int score=0;
		for(CardDto dto : myCardList) {
				score += dto.value;
	}
		return score;
	}
}