package two;

import java.util.LinkedList;



public class Main { public static void main(String[] args) {
        LinkedList<Card> deck = new LinkedList<>();

        for (int c = 1; c <= 13; c++) {
            deck.add(new Card(c, Suit.CLUBS));
        }

        for(int i = 0; i < deck.size(); i++) {
            System.out.println(deck.get(i).toString());
        }
    }
}
