package com.brendan.module2.two;

import java.util.LinkedList;



public class Main { public static void main(String[] args) {
        LinkedList<Card> deck = new LinkedList<>();
        LinkedList<Card> myCards = new LinkedList<>();

        for (int c = 1; c <= 13; c++) {
            deck.add(new Card(c, Suit.CLUBS));
            deck.add(new Card(c, Suit.SPADES));
            deck.add(new Card(c, Suit.HEARTS));
            deck.add(new Card(c, Suit.DIAMONDS));
        }

        for(int i = 1; i <= 7; i++) {
            myCards.add(deck.poll());
        }

        for (int i = 0; i < myCards.size(); i++) {
            System.out.println(myCards.get(i).toString());
        }

    }
}
