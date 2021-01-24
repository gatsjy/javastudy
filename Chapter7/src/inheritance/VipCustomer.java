package inheritance;

public class VipCustomer extends Customer {

    double salesRatio;
    private int agentID;

    public VipCustomer(int customerID, String customerName) {
        super(customerID, customerName); // 명시적으로 상위클래스의 맞는 생성자를 호출해줘야 한다.

        customerGrade = "VIP";
        bonusRatio = 0.5;
        salesRatio = 0.01;
    }

    /*VipCustomer(){
        System.out.println("vipCustomer() 생성자 부분");
        // protected 키워드로 상속받은 것에서 접근할 수 있도록 설정해준다.
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.01;
    }*/

    // 이미 구현된 메서드를 다시 재 구현 합니다.
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }
}
