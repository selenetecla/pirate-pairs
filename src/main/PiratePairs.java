import java.util.Arrays;
public class PiratePairs {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck.getArray());
        deck.shuffleDeck();
        System.out.println(deck.getArray());
        System.out.println(deck.drawCard());
    }
}