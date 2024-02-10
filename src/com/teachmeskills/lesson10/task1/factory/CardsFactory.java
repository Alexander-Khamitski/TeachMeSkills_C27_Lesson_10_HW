package com.teachmeskills.lesson10.task1.factory;

import com.teachmeskills.lesson10.task1.card.Card;

public class CardsFactory {

    public static Card[] generateCards() {
        Card card0 = new Card(111, "1111-1111", 1000);
        Card card1 = new Card(222, "2222-2222", 2000);
        Card card2 = new Card(333, "3333-3333", 3000);
        Card card3 = new Card(111, "1111-1111", 4000);
        Card card4 = new Card(444, "4444-4444", 5000);
        Card card5 = new Card(555, "5555-5555", 6000);
        Card card6 = new Card(333, "3333-3333", 7000);
        Card card7 = new Card(222, "2222-2222", 8000);
        Card card8 = new Card(333, "3333-3333", 9000);
        Card card9 = new Card(333, "3333-3333", 10000);
//        111 - 2
//        222 - 2
//        333 - 4
//        444 - 1
//        555 - 1
        return new Card[] {card0, card1, card2, card3, card4, card5, card6, card7, card8, card9};
    }
}
