import java.util.Arrays;
import java.util.Random;
public class Deck {
    final int numOfCards = 55;
    private int[] cards = new int [numOfCards];
    public Deck() {
        int cardNumber = 1;
        for (int i = 0; i < cards.length; i++) {
            cards[i] = cardNumber;
            cardNumber = (cardNumber % 10) + 1;
        }
    }
    public String getArray() { 
        return ;
    }
    public void shuffleDeck() {
        for (int i = cards.length - 1; i > 0; i--) {
            int index = (i + 1);
            int temp = cards[i];
            cards[i] = cards[index];
            cards[index] = temp;
        }
    }
}
