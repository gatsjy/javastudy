package abstractex;

// 추상 클래스
// 인터페이스는 일종의 추상클래스이다. 인터페이스는 추상클래스처럼 추상 메서드를 갖미나 추상클래스보다 추상화 정도가 높아서 추상클래스와는 달리 몸통을 갖춘 일반 메서드 또는 멤버구성원으로 가질 수 없다.
// 오직 추상 메서드만 상수만들 멤버로 가질 수 있으며, 그 외의 어떠한 요소도 허용하지 않는다.
// 추상클래스를 부분적으로만 완성된 '미완성 설계도'라고 한다면, 인터페이스는 구현된 것은 아무것도 없고 밑그림만 그려진 '기본설계도'라고 할 수 있다.

public abstract class Computer {

    // 바디를 구현하지 않으면 추상 메서드를 의미한다.
    // 추상적이다 말그대로 구체적이지 않다.
    // 추상 메서드를 포함한 클래스 ->
    public abstract void display();
    public abstract void typing();

    public void turnOn(){
        System.out.println("전원을 켭니다.");
    }

    public void turnOff(){
        System.out.println("전원을 끕니다.");
    }
}
