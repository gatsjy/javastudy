package codingTest2;

public class CardCompanyTest {

    public static void main(String[] args) {

        CardCompany company = CardCompany.getInstance();

        Card MyCard = company.createCard();
        Card YourCard = company.createCard();

        System.out.println("MyCard.getCardNum() = " + MyCard.getCardNum());
        System.out.println("YourCard.getCardNum() = " + YourCard.getCardNum());
    }
}
