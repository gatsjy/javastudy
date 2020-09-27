package inheritance;

public class VipCustomer extends Customer {

    double salesRatio;
    private int agentID;

    VipCustomer(){
        // protected 키워드로 상속받은 것에서 접근할 수 있도록 설정해준다.
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.01;
    }

}
