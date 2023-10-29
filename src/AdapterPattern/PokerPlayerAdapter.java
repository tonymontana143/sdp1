package AdapterPattern;

// Adapter class
class PokerPlayerAdapter implements PokerPlayer {
    private OldPokerPlayer oldPlayer;

    public PokerPlayerAdapter(OldPokerPlayer oldPlayer) {
        this.oldPlayer = oldPlayer;
    }

    @Override
    public void bet(int amount) {
        oldPlayer.makeWager(amount);
    }

    @Override
    public void revealHand() {
        oldPlayer.exposeHand();
    }
}
