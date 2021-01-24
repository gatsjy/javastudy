package CodingTest;

// 하위 클래스에 대한 구현내용을 다시 재정의 하는 것을 오버라이딩이라고 한다.
public class VipCustomer extends Customer {

    // VipCustomer은 담당 상담원을 배정 시킨다. -> 기다리지않고 상담원을 바로바로 연결해준다.
    double salesRatio;
    private int agentID;

    // Getter Setter 와 상위의 모든 걸 구현할 필요가있나? -> 상속으로
    // 상속을 받으면 부모의 것을 내가 쓸 수 있는 것이다.
    // private클래스는 외부의 누구도 바로 접근할 수 없다.
    public VipCustomer(int customerID, String customerName) {

        super(customerID, customerName); // 명시적으로 상위클래스의 맞는 생성자를 호출해줘야 한다.

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    // 이미 구현된 메서드를 다시 재 구현 합니다.
    // 오버로딩은 메서드 이름은 같은데 매개변수가 다른거, 오버라이딩은 덮어 쓴다.
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }
}
