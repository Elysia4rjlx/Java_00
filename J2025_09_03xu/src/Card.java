public class Card {
    public String suit;//花色
    public int rank;//牌面值

    public Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "("+suit + " " + rank + ")";
    }
}
