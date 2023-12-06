public class Dealer {
    private Deck deck;
    private Player[] players;
    private final int numOfPlayers = 4;
    private int losingScore;
    private boolean done;
    private int round;

    public Dealer() {
        deck = new Deck();
        players = new Player[numOfPlayers];
        losingScore = (60 / numOfPlayers) + 1;
        for (int i = 0; i < numOfPlayers; i++) {
            players[i] = new Player();
        }
        round = 1;
    }
    public void showPlayersHand() {
        System.out.println("----------------------------------");
        System.out.println("Round: " + round);
        for (int i = 0; i < numOfPlayers; i++) {
            System.out.println("Player " + (i + 1) + " Hand: " + players[i].showHand());
            System.out.println("Player " + (i + 1) + " Score: " + players[i].getScore());
            System.out.println("");
        }
    }

    public void gameInPlay() {
        deck.shuffleDeck();
        System.out.println("Welcome to Pirate Pairs!");
        System.out.println("Losing Score: " + losingScore);
        System.out.println("Discard Pile: " + deck.getDiscardDeck());
        //System.out.println("Choices: Draw Card or Fold.");

//Without folding. Checks to see if there is a pair and/or if they lost.
        while(!done) {
            for(int i = 0; i < numOfPlayers; i++) {
                onceDrawn(players[i]);
                showPlayersHand();
                if(players[i].hasPair()) {
                    int cardPairValue = players[i].getCard();
                    players[i].updateScore(cardPairValue);
                    System.out.println("Player " + (i+1) + " has a pair of " + cardPairValue + "'s.");
                    players[i].removeHandForPair(deck);
                    deck.addToDiscardDeck(cardPairValue);
                }
                if(players[i].getScore() > losingScore) {
                    System.out.println("Player " + (i+1) + " has surpassed the losing score. Game over!");
                    done = true;
                    break;
                }
                round++;
                System.out.println("Discard Pile: " + deck.getDiscardDeck());
            }
        }
    }
//onceDrawn pulls and draws a card and adds it to its hand.
     private void onceDrawn(Player player) {
        int drawnCard = deck.drawCard();
        player.addToHand(drawnCard);
    }
}
//attempt at including folding
    //     while(!playingGame) {
    //         for (int i = 0; i < numOfPlayers; i++) {
    //             int randomChoice = (int) (Math.random() * 2) + 1;
    //             if(randomChoice == 1) {
    //                 ifDrawingCard(i);
    //             } else {
    //                 ifFolding(i);
    //             }
    //             if(players[i].getScore()> losingScore) {
    //                 System.out.println("Player " + (i+1) + " has surpassed the losing score. Game over!");
    //                 playingGame = true;
    //                 break;
    //             }
    //             System.out.println("Discard Pile: " + deck.getDiscardDeck());
    //         }
    //         round++;
    //     }
    // }
    // public void ifDrawingCard(int i) {
    //     onceDrawn(players[i]);
    //     showPlayersHand();
    //     if(players[i].hasPair()) {
    //         int cardPairValue = players[i].getCard();
    //         players[i].updateScore(cardPairValue);
    //         System.out.println("Player " + (i+1) + " has a pair of " + cardPairValue + "'s.");
    //         players[i].removeHand();
    //         deck.addToDiscardDeck(i);
    //     } else {
    //         System.out.println("Player " + (i+1) + " drew.");
    //     }
        
    // }

    // public void ifFolding(int i) {
    //     players[i].fold(players);
    //     players[i].removeHand();
    //     deck.addToDiscardDeck(i);
    //     showPlayersHand();
    //     System.out.println("Player folded.");
    // }

