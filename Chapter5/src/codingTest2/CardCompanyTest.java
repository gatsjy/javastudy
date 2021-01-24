package codingTest2;

// 다형성이란?
// 하나의 코드가 여러 자료형으로 구현되어 실행되는 것
// 같은 코드에서 여러 실행 결과가 나옴
// 정보은닉, 상속과 더불어 객체지향 프로그래밍의 가장 큰 특징 중 하나
// 객체지향 프로그래밍의 유연성, 재활용성, 유지보수성에 기본이 되는 특징임
public class CardCompanyTest {

    public static void main(String[] args) {

        CardCompany company = CardCompany.getInstance();

        Card MyCard = company.createCard();
        Card YourCard = company.createCard();

        System.out.println("MyCard.getCardNum() = " + MyCard.getCardNum());
        System.out.println("YourCard.getCardNum() = " + YourCard.getCardNum());
    }
}
