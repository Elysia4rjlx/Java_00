package CardGame;

import java.util.ArrayList;
import java.util.List;

public class playGame {
    public static void main(String[] args) {
        CardGame cardGame = new CardGame();
        List<Card> cardBox = CardGame.buyCard();
        System.out.println(cardBox);
        cardGame.shuffle(cardBox);
        System.out.println("洗牌：" + cardBox);


        //三个人轮流抽5张扑克牌

        List<Card> hands1 = new ArrayList<>();
        List<Card> hands2 = new ArrayList<>();
        List<Card> hands3 = new ArrayList<>();

        List<List<Card>>hands = new ArrayList<>();
        hands.add(hands1);
        hands.add(hands2);
        hands.add(hands3);



        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                Card card = cardBox.remove(0);
                hands.get(j).add(card);
            }
        }
        System.out.println("第1个人："+hands1);
        System.out.println("第2个人："+hands2);
        System.out.println("第3个人："+hands3);
    }


}
