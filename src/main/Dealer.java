public class Dealer {
    private Deck deck;
    private Player player1;
    private Player player2;
    private Player player3;
    private Player player4;
    private final int numOfPlayers = 4;
    private int losingScore;

    public Dealer() {
    player1 = new Player();
    player2 = new Player();
    player3 = new Player();
    player4 = new Player();
    losingScore = (60 / numOfPlayers) + 1;
    }
    public void gameInPlay() {
        System.out.println("RAW DECK: " + deck.getArray());
        System.out.println("SHUFFLED: " + deck.getArray());
    }
}
