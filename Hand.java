
public class Hand {
    private Card[] cards = new Card[5];
    private int count = 0;

    public boolean addCard(Card card) {
        if (count >= 5 || card == null) {
            return false;
        }

        cards[count++] = card;
        return true;
    }

    public int getTotal() {
        int total = 0;
        int aces = 0;

        for (int i = 0; i < count; i++) {
            total += cards[i].getPoints();

            if (cards[i].getName().equals("Ace")) {
                aces++;
            }
        }

        while (total > 21 && aces > 0) {
            total -= 10;
            aces--;
        }

        return total;
    }

    public void printHand() {
        for (int i = 0; i < count; i++) {
            System.out.println(cards[i]);
        }

        System.out.println("Total: " + getTotal());
    }

    public int getCount() {
        return count;
    }
}
