public class Player {
    private int[] playerHand;
    private int score = 0;
    public Player() {
        playerHand = new int [0];
    }

    public void addToHand(int card) {
        int updatedHand[] = new int [playerHand.length + 1];
        for(int i = 0; i < playerHand.length; i++) {
            updatedHand[i] = playerHand[i];
        }
        updatedHand[playerHand.length] = card;
        playerHand = updatedHand;
    }

    public void removeHand() {
        playerHand = new int[0];
    }
    
    public boolean hasPair(int drawCard) {
        for(int i =0; i< playerHand.length; i++) {
            if(card == drawCard) {
                return true;
            }
        }
        return false;
    }
    public String updateScore() {
        if (hasPair()) {

        }
    }
}
