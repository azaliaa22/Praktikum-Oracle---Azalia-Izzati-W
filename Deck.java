
import java.util.Random;

public class Deck {
    private Card[] cardArray = new Card[52];
    private int cardCount = 0;

    public Deck() {
        for (int suit = 1; suit <= 4; suit++) {
            for (int card = 1; card <= 13; card++) {
                cardArray[cardCount++] = new Card(suit, card);
            }
        }
    }

    public void shuffle() {
        Random random = new Random();

        for (int i = cardArray.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            Card temp = cardArray[i];
            cardArray[i] = cardArray[j];
            cardArray[j] = temp;
        }

        cardCount = 0;
    }

    public Card dealCard() {
        if (cardCount >= cardArray.length) {
            return null;
        }

        return cardArray[cardCount++];
    }

    public void print() {
        for (Card card : cardArray) {
            System.out.println(card);
        }
    }
}
