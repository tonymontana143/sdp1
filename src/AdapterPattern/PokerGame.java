package AdapterPattern;

// Client code
public class PokerGame {
    public static void main(String[] args) {
        // Existing poker player
        OldPokerPlayer oldPlayer = new OldPokerPlayer();

        // Adapter
        PokerPlayer adapter = new PokerPlayerAdapter(oldPlayer);

        // Using the adapter to play a hand
        adapter.bet(70);
        adapter.revealHand();
    }
}