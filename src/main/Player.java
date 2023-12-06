import java.util.Arrays;

public class Player {
    private int[] playerHand;
    private int score = 0;
    public Player() {
        playerHand = new int [0];
    }

    public String showHand() {
        return Arrays.toString(playerHand);
    }

//this makes a new hand and transfers over the values of the original hand
    public void addToHand(int card) {
        int updatedHand[] = new int [playerHand.length + 1];
        for (int i = 0; i < playerHand.length; i++) {
            updatedHand[i] = playerHand[i];
        }
        updatedHand[playerHand.length] = card;
        playerHand = updatedHand;
    }

    public void removeHand() {
        playerHand = new int[0];
    }
    
//checks to see if there is pair between the player's hand.
    public boolean hasPair() {
        for (int i = 0; i < playerHand.length; i++) {
            for (int x = i + 1; x < playerHand.length; x++) {
                if (playerHand[i] == playerHand[x]) {
                    return true;
                }
            }
        }
        return false;
    }

    public int getScore() {
        return score;
    }

    public void updateScore(int newPoints) {
            score += newPoints;
    }

    public int getCard() {
        return playerHand[playerHand.length - 1];
    }
//fold method: doesn't work
    public int fold(Player[] players) {
        int min = 0;
        for(Player player : players) { // sets it up to look for a min
            int playerCard = player.getCard();
            if (playerCard < min) {
                min = playerCard;
            }
        }
        System.out.println("Minimum value in other's hand: " + min);
        return min;
    }
}
