package com.brendan.module2.three;
import java.util.Collections;
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


        Collections.sort(deck);

       /* System.out.println("Sorted by Face Value");

        for(int i = 0; i < deck.size(); i++) {
            System.out.println(deck.get(i).toString());
        }
        */
        System.out.println("Sorted by Suit");
        SortSuits ss = new SortSuits();
        Collections.sort(deck,ss);
        for(Card card : deck){
            System.out.println(card);
        }

        System.out.println("Sorted by Face");
        SortFace sf = new SortFace();
        Collections.sort(deck,sf);
        for(Card card : deck){
            System.out.println(card);
        }



    }
}
