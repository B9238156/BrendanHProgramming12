package com.brendan.module2.three;
import java.util.Comparator;

public class Card implements Comparable<Card> {
    int value;
    Suit suit;
    boolean faceCard;
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
    public int compareTo(Card c) {
        if(this.value > c.value){
            return 1;
        }
        else if (this.value < c.value){
            return -1;
        }
        else {
           return 0;
        }
    }

    @Override
    public String toString () {
        return value + " of " + suit;
    }

}

