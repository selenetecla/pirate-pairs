import java.util.Arrays;
public class PiratePairs {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffleDeck();
        System.out.println(Arrays.toString(deck));
    }
}