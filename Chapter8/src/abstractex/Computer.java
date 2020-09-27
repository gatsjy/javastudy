package abstractex;

public abstract class Computer {

    // 바디를 구현하지 않으면 추상 메서드를 의미한다.
    public abstract void display();
    public abstract void typing();

    public void turnOn(){
        System.out.println("전원을 켭니다.");
    }

    public void turnOff(){
        System.out.println("전원을 끕니다.");
    }
}
