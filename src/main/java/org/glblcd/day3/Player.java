package org.glblcd.day3;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int numberOfHoldingCard;
    private List<Card> playersCards;

    public Player(){
        playersCards = new ArrayList<>();
        playersCards.add(Deck.share());
        playersCards.add(Deck.share());
    }

    public int getNumberOfHoldingCard() {
        return numberOfHoldingCard;
    }

    public List<Card> getPlayersCards() {
        return playersCards;
    }

    public void requestForCard(){
        playersCards.add(Deck.share());
    }
}
