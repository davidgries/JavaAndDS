import java.util.*;
public class CardGame {
    
    /** Shuffle a new deck of cards, deal d cards to p players,
      * and print the hands. */
    public static void shuffleAndDeal(int d, int p) {
        List<Card> deck= Card.newDeck(); // the deck of cards.
        Collections.shuffle(deck);
        
        ArrayList<Card>[] hands= new ArrayList[p]; // each element will contain d cards
        for (int player= 0; player < p; player= player+1)
            hands[player]= new ArrayList<Card>();
        
        for (int k= 1; k <= d; k= k+1) {
            // Deal a card to each of the players
            for (int player= 0; player < p; player= player+1) {
                Card card= deck.remove(0);
                hands[player].add(card);
            }
        }
        
        for (int player= 0; player < p; player= player+1)
            System.out.println(hands[player]);
    }
}