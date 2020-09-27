package inheritance;

public class CustomerTest {

    public static void main(String[] args) {
        Customer customerLee = new Customer(10010,"이순신");
        //customerLee.setCustomerName("이순신");
        //customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        System.out.println("customerLee = " +customerLee.showCustomerInfo());

        // vipcustomer을 호출을 할때 상위 클래스가 먼저 생성이 됩니다.
        Customer customerKim = new VipCustomer(10020,"김유신");
        //customerKim.setCustomerName("김유신");
        //customerKim.setCustomerID(10020);
        customerKim.bonusPoint = 10000;
        System.out.println("customerKim = " + customerKim.showCustomerInfo());

        // 하위 클래스가 생성되는 과장
        // 하위 클래스가 생성 될 때 상위 클래스가 먼저 생성 됨
        // 상위 클래스의 생성자가 호출되고 하위 클래스의 생성자가 호출 됨
        // 하위 클래스의 생성자에서는 무조건 상위 클래스의 생성자가 호출 되어야 함
        
        // 하위 클래스에서 상위 클래스의 생성자를 호출하는 코드가 없는 경우 컴파일러는 상위 클래스의 기분 생성자를 호출하기 위한 super() 를 추가함
        // super()로 호출되는 생성자는 상위 클래스의 기본 생성자임
        
        // 만약 상위 클래스의 기본생성자가 없는 경우 ( 매개변수가 있는 생성자만 존재 하는 경우)
        // 하위 클래스는 명시적으로 상위 클래스의 생성자를 호출 해야 함
    }
}
