import java.util.*;

/** An instance is one card of a deck of cards, with a suit and a rank. */
public class Card {
    public enum Rank {DEUCE, THREE, FOUR, FIVE, SIX,
               SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE}

    public enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES}

    public final Rank rank;
    public final Suit suit;
    
    /** Constructor: an instance with suit s and rank r */
    private Card(Suit s, Rank r) {
        suit= s;
        rank= r;
    }
    
    /** Return a representation of this card. */
    public @Override String toString() {return rank + " of " + suit;}
    
    /** Return a deck of cards. */
    public static List<Card> newDeck() {
        List<Card> deck= new ArrayList<Card>();
        for (Suit s : Suit.values())
            for (Rank r : Rank.values())
                deck.add(new Card(s, r));   
        return deck;
    }
    
}