package com.brendan.module2.two;

public class Card {
    int value;
    Suit suit;
    boolean faceCard;

    /**
     * Checks if card is a face card
     * @param value
     * @param suit
     */
    public Card(int value, Suit suit) {
    this.value = value;
    this.suit = suit;
    if (value > 10) {
        this.faceCard = true;
    } else {
        this.faceCard = false;
    }
}
    @Override
    public String toString () {
        return value + " of " + suit;
    }

}

