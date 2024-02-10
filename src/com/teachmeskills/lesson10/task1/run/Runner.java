package com.teachmeskills.lesson10.task1.run;

import com.teachmeskills.lesson10.task1.card.Card;
import com.teachmeskills.lesson10.task1.client.Client;
import com.teachmeskills.lesson10.task1.factory.CardsFactory;
import com.teachmeskills.lesson10.task1.service.CardComparisonService;

public class Runner {
    public static void main(String[] args) {
        Card[] cards = CardsFactory.generateCards();
        Client client = new Client("a45fhj3", cards);
        CardComparisonService.getClientEqualCardsAmount(client);
    }
}
