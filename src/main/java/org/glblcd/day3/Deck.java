package org.glblcd.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public final class Deck {
    private static List<Card> cards;

    public static void setup(){
        cards = new ArrayList<>();
        for (Suit s : Suit.values()){
            for (FaceValue fv : FaceValue.values()) {
                final Card c = new Card(s, fv);
                cards.add(c);
            }
        }
    }

    public static void shuffle(){
        Collections.shuffle(cards);
    }

    public static List<Card> getCards() {
        return cards;
    }

    public static Card share(){
        Card topCard = cards.get(0);
        cards.remove(topCard);
        return topCard;
    }
}
