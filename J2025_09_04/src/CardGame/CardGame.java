package CardGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardGame {
    public static final String[] suits = {"♠", "♥", "♣", "♦"};//不同花色


    //买牌
    public static List<Card> buyCard() {
        List<Card> cardBox = new ArrayList<>(52);
        for (int i = 0; i < 4; i++) {
            //JQK分别用11,12,13代替
            for (int j = 1; j < 13; j++) {
                String suit = suits[i];//花色
                int rank = j;//牌值
                Card card = new Card(suit, rank);
                cardBox.add(card);
            }
        }
        return cardBox;
    }

    //洗牌
    public void shuffle(List<Card> cardBox) {
        Random random = new Random();

        for (int i = cardBox.size() - 1; i > 0; i--) {
            int index = random.nextInt(i);
            swap(cardBox,i,index);
        }
    }

    private void swap(List<Card>cardBox,int i, int index) {
        Card temp = cardBox.get(i);
        cardBox.set(i,cardBox.get(index));
        cardBox.set(index,temp);
    }






























}
