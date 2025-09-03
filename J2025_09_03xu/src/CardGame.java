import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class CardGame {
    public static final String[] suits = {"♠", "♥", "♣", "♦"};
    //买扑克牌
    public static List<Card> buyCard(){
        List<Card> cardList = new ArrayList<>(52);
        for (int i = 0; i < 4; i++) {
            //JQK分别用11,12,13代替
            for (int j = 1; j <= 13; j++) {
                String suit = suits[i];
                int rank = j;
                //生成不同数字的花色牌
                Card card = new Card(suit,rank);
                cardList.add(card);
            }
        }
        return cardList;
    }


    //洗牌
    public void shuffle(List<Card> cardList){
        Random random = new Random();
        for (int i = cardList.size()-1; i > 0; i--) {
            int index = random.nextInt(i);
            swap(cardList,i,index);
        }
    }

    private void swap(List<Card> cardList,int i,int j){
        Card temp = cardList.get(i);
        cardList.set(i,cardList.get(j));
        cardList.set(j,temp);
    }
}
