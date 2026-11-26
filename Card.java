
public class Card {
    private String suit;
    private String name;
    private int points;

    public Card(int suitNumber, int faceNumber) {
        String[] suits = {
            "Hearts", "Diamonds", "Clubs", "Spades"
        };

        String[] names = {
            "", "Ace", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten",
            "Jack", "Queen", "King"
        };

        suit = suits[suitNumber - 1];
        name = names[faceNumber];

        if (faceNumber == 1) {
            points = 11;
        } else if (faceNumber >= 11) {
            points = 10;
        } else {
            points = faceNumber;
        }
    }

    public String getName() {
        return name;
    }

    public String getSuit() {
        return suit;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "The " + name + " of " + suit;
    }
}
