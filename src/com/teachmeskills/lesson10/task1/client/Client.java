package com.teachmeskills.lesson10.task1.client;

import com.teachmeskills.lesson10.task1.card.Card;

public class Client {

    private String id;
    private Card[] cards;

    public Client(String id, Card[] cards) {
        this.id = id;
        this.cards = cards;
    }

    public Card[] getCards() {
        return cards;
    }
}
