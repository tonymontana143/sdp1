package AdapterPattern;

// Adaptee interface
class OldPokerPlayer {
    void makeWager(int betAmount) {
        System.out.println("Placing a bet of $" + betAmount);
    }

    void exposeHand() {
        System.out.println("Revealing hand to all players.");
    }
}