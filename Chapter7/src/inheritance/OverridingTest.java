package inheritance;

public class OverridingTest {

    public static void main(String[] args) {
        Customer customerLee = new Customer(10010,"이순신");
        customerLee.bonusPoint = 1000;

        VipCustomer customerKim = new VipCustomer(10010,"이순신");
        customerKim.bonusPoint = 10000;

        int priceLee = customerLee.calcPrice(10000);
        int priceKim = customerKim.calcPrice(10000);
        System.out.println(customerLee.showCustomerInfo() + "지불 금액은 " + priceLee);
        System.out.println(customerKim.showCustomerInfo() + "지불 금액은 " + priceKim);

        Customer customerNo = new VipCustomer(1030, "나플라");
        customerNo.bonusPoint=10000;
        // Customer로 호출이 되지만 재정의 되어있기 때문에 vipCustomer의 메서드가 호출이 됩니다.
        int priceNo = customerKim.calcPrice(10000);
        System.out.println(customerNo.showCustomerInfo() + "지불 금액은 " + priceNo);

    }
}
