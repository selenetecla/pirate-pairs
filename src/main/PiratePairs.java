import java.util.Arrays;
import java.util.Scanner;
public class PiratePairs {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println("RAW DECK: " + deck.getArray());
        System.out.println("SHUFFLED: " + deck.getArray());
        System.out.println("DRAWN FROM PILE: " + deck.drawCard());
        System.out.println("NEW DECK: " + deck.getArray());
        Player[] player1 = new Player[];
    }
}