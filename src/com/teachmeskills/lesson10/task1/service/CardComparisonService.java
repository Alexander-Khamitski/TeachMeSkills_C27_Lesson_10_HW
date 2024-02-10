package com.teachmeskills.lesson10.task1.service;

import com.teachmeskills.lesson10.task1.card.Card;
import com.teachmeskills.lesson10.task1.client.Client;

public class CardComparisonService {

    public static void getClientEqualCardsAmount(Client client) {
        Card[] cards = client.getCards();
        if (cards.length == 0) {
            System.out.println("Client does not have cards at all.");
            return;
        }
        int amountOfEqualsCards = 0;
//        0 = 3
//        1 = 7
//        2 = 6 = 8 = 9
        for (int i = 0; i < cards.length; i++) {
            boolean isFirstMath = true;
            for (int j = i + 1; j < cards.length; j++) {
                if (cards[i] == null || cards[j] == null) {
                    continue;
                }
                if (cards[i].equals(cards[j]) && isFirstMath) {
                    isFirstMath = false;
                    amountOfEqualsCards += 2;
                    cards[j] = null;
                } else if (cards[i].equals(cards[j])) {
                    amountOfEqualsCards += 1;
                    cards[j] = null;
                }
            }
        }
        getInfoAboutEqualCards(amountOfEqualsCards);
    }

    private static void getInfoAboutEqualCards(int amountOfEqualsCards) {
        if (amountOfEqualsCards == 0) {
            System.out.println("Client does not have equal cards.");
        } else {
            System.out.println(String.format("Client has '%d' equal cards.", amountOfEqualsCards));
        }
    }
}
