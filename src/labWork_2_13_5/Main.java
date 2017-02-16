package labWork_2_13_5;

/**
 * Created by Bulik on 11.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        Card[] cards = new Card[52];
        int i =0;
        for (Suit suit : Suit.values()){
            for (Rank rank : Rank.values()){
                cards[i] = new Card(suit, rank);
                i++;
            }

        }
        for (Card elem : cards){
            System.out.println("The Card: " + elem);
        }

    }
}
