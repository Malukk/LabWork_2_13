package labWork_2_13_5;

/**
 * Created by Bulik on 11.08.2016.
 */
public class Card {
    private Suit cardSuit;
    private Rank cardRank;

    public Card(Suit cardSuit, Rank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    @Override
    public String toString() {
        return cardRank +" "+ cardSuit;
    }
}
