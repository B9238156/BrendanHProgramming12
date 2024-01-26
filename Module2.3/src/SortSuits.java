import java.util.Comparator;


public class SortSuits implements Comparator<Card>{

    @Override
    public int compare(Card c1, Card c2) {
        int sortOrder;
        sortOrder = c1.suit.compareTo(c2.suit);
        return sortOrder;
    }


}
