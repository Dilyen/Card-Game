package org.glblcd.day3;

import java.util.Objects;

public class Card {
    private Suit cardSuit;
    private FaceValue cardFaceValue;

    public Card(Suit s, FaceValue fv) {
        cardSuit = s;
        cardFaceValue = fv;
    }

    @Override
    public String toString() {
        return cardSuit + ":" + cardFaceValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return cardSuit == card.cardSuit &&
                cardFaceValue == card.cardFaceValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardSuit, cardFaceValue);
    }
}
