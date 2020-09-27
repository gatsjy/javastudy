package codingTest2;

public class Card {

    private static int cardSeq = 10000;
    private int CardNum;

    public Card(){
        this.cardSeq++;
        CardNum = cardSeq;
    };

    public static int getCardSeq() {
        return cardSeq;
    }

    public int getCardNum() {
        return CardNum;
    }

}
