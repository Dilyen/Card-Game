package blackjack;

import org.glblcd.day3.Card;
import org.glblcd.day3.Deck;
import static org.junit.Assert.*;

import org.glblcd.day3.FaceValue;
import org.glblcd.day3.Suit;
import org.junit.Before;
import org.junit.Test;


public class TestDeck {

    @Before
    public void setup(){
        Deck.setup();
    }

   @Test
    public void givenDeck52CardsArePresent(){
        assertEquals("Size of Deck is not 52",52, Deck.getCards().size());
   }

   @Test
    public void givenCardIsAvailableInDeck(){
       assertEquals("Card is not present in Deck", new Card(Suit.CLUB, FaceValue.FOUR), Deck.getCards().get(2));
   }

   /**
    @Test
    public void givenCardIsAvailableChangesPositionInDeckAfterShuffle(){
        Deck.shuffle();
        assertNotEquals("Card is still in place", new Card(Suit.CLUB, FaceValue.FOUR), Deck.getCards().get(2));
    }
    */

    @Test
    public void shareReturnsACardObject(){
        assertTrue(Deck.share() instanceof Card);
    }
}
