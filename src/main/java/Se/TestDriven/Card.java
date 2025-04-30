package Se.TestDriven;

public class Card {
    private String suit;
    private int value;
    private cardTypes cardType;
    private String cardName;

    public Card(String cardName, String  suit, int value, cardTypes cardType) {
        this.cardName = cardName;
        this.suit = suit;
        this.value = value;
        this.cardType = cardType;

    }

    @Override
    public String toString() {
        // Exempel: "Ace of Spades"
        return String.format("%s of %s", cardName, suit);
    }



    public String getCardName() {
        return cardName;
    }

    public int getValue() {
        return value;
    }

    public cardTypes getType() {
        return cardType;
    }


    public String getSuit() {
        return suit;
    }
}


