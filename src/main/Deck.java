import java.util.Arrays;
public class Deck {
    final int numOfCards = 55;
    int[] cards = new int [numOfCards];
    private int starterIndex = 0;
     int card;
    public Deck() {
        int cardIndex = 0;
        for (int cardNumber = 1; cardNumber <= 10; cardNumber++) {
            for (int i = 1; i <= cardNumber; i++) {
                cards[cardIndex++] = cardNumber;
            }
        }
    }
    public String getArray() { 
        return Arrays.toString(cards);
    }
    public void shuffleDeck() {
        for (int i = cards.length - 1; i > 0; i--) {
            int index = (int)(Math.random()*(i));
            int temp = cards[i];
            cards[i] = cards[index];
            cards[index] = temp;
        }
    }

    public int drawCard() {
        card = cards[starterIndex];
        int[] tempArray = new int[cards.length - 1];
        for(int i = starterIndex +1; i< cards.length; i++) {
            tempArray[i-1] = cards [i];
        }
        cards = tempArray;
        return card;
    }
    public int drawnCard() {
        
    }
}
