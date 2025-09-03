import java.util.List;

public class Text {
    public static void main(String[] args) {
     CardGame cardGame = new CardGame();
        List<Card> cardList = cardGame.buyCard();
        System.out.println(cardList);
        cardGame.shuffle(cardList);
        System.out.println();
        System.out.println("洗牌后："+cardList);


    }
}
