package com.brendan.module2.three;
import java.util.Comparator;


public class SortSuits implements Comparator<Card>{

    /**
     * Sorts cards by suit.
     * @param c1 the first card to be compared.
     * @param c2 the second card to be compared.
     * @return
     */
    @Override
    public int compare(Card c1, Card c2) {
        int sortOrder;
        sortOrder = c1.suit.compareTo(c2.suit);
        return sortOrder;
    }


}
