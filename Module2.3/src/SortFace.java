import java.util.Comparator;


public class SortFace implements Comparator<Card>{

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
