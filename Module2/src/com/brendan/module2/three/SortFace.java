package com.brendan.module2.three;
import java.util.Comparator;


public class SortFace implements Comparator<Card>{

    /**
     * Sorts cards by face
     * @param c1 the first card to be compared.
     * @param c2 the second card to be compared.
     * @return
     */
    @Override
    public int compare(Card c1, Card c2) {
        if(c1.faceCard && !c2.faceCard) {
            return 1;
        } else if (!c1.faceCard && c2.faceCard) {
            return -1;
        }
        return 0;
    }


}
