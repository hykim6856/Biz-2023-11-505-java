package com.callor.blackjack.service;

import com.callor.blackjack.models.CardDto;

public interface CardService {

	public void makeCardDeck();
	
	public CardDto getCardDeck();
}
