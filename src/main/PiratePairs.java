import java.util.Arrays;
public class PiratePairs {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println("RAW DECK: " + deck.getArray());
        deck.shuffleDeck();
        System.out.println("SHUFFLED: " + deck.getArray());
        System.out.println("DRAWN FROM PILE: " + deck.drawCard());
        System.out.println()
    }
}