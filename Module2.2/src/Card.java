public class Card {
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
    public String toString () {
        return value + " of " + suit;
    }

}

