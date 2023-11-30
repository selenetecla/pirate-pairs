public class Player {
    private int[] playerHand;
    public Player() {
        playerHand = new int [0];
    }
    public void addToHand(int card) {
        int updatedHand[] = new int [playerHand.length + 1];
        updatedHand[playerHand.length] = card;
        playerHand = updatedHand;
    }
    public void removeHand() {
        playerHand = new int[0];
    }
}
