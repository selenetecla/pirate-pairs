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
    
    public boolean hasPair(int drawCard) {
        for(int i =0; i< playerHand.length; i++) {
            if(card == drawCard) {
                return true;
            }
        }
        return false;
    }
}
