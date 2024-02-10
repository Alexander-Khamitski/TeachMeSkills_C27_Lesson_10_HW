package com.teachmeskills.lesson10.task1.card;

import java.util.Objects;

public class Card {

    private int cvv;
    private String cardNumber;
    private double balance;

    public Card(int cvv, String cardNumber, double balance) {
        this.cvv = cvv;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cvv == card.cvv && Objects.equals(cardNumber, card.cardNumber);
    }
}
