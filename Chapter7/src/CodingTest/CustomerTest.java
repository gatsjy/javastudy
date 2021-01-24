package CodingTest;

public class CustomerTest {

    public static void main(String[] args) {

        Customer CustomerLee = new Customer(10010, "Lee");
        CustomerLee.setBonusPoint(10000);
        Customer CustomerKim = new VipCustomer(10011, "Kim");
        CustomerKim.setBonusPoint(10000);

        System.out.println(CustomerLee.showCustomerInfo());
        System.out.println(CustomerKim.showCustomerInfo());
    }
}
