import java.util.Arrays;
import java.util.Random;
public class Deck {
    final int numOfCards = 55;
    public Deck() {
        int[] deck = new int [numOfCards];
        int cardNumber = 1;
        for (int i = 0; i < deck.length; i++) {
            deck[i] = cardNumber;
            cardNumber = (cardNumber % 10) + 1;
        }
    }
        public void shuffleDeck() {
        for (int i = deck.length - 1; i > 0; i--) {
            int index = (i + 1);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
}
