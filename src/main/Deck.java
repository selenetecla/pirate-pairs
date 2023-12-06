import java.util.Arrays;
public class Deck {
    final int numOfCards = 55;
    private int[] cards = new int[numOfCards];
    private int starterIndex = 0;
    private int[] discardDeck = new int[0];
    private int card;

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
            int index = (int) (Math.random() *(i));
            int temp = cards[i];
            cards[i] = cards[index];
            cards[index] = temp;
        }
    }

    public int drawCard() {
        card = cards[starterIndex];
        int[] tempArray = new int[cards.length - 1];
        for(int i = starterIndex + 1; i < cards.length; i++) {
            tempArray[i-1] = cards [i];
        }
        cards = tempArray;
        return card;
    }

//this takes in a card and sent over to the discard pile
    public void addToDiscardDeck(int discardedCard) {
        int[] temp = new int [discardDeck.length + 1];
        for(int i = 0; i < discardDeck.length; i++) {
            temp[i] = discardDeck[i];
        }
        temp[discardDeck.length] = discardedCard;
        discardDeck = temp;
    }

//is supposed to add an entire hand--this would've worked for the fold function
    public void addToDiscardDeck(int[] hand) {
        for(int i = 0; i < hand.length; i++) {
            addToDiscardDeck(hand[i]);
        }
    }

    public String getDiscardDeck() { 
        return Arrays.toString(discardDeck);
    }
}
