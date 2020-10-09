/**
 * @author Gatsjy
 * @since 2020-10-09
 * realize dreams myself
 */
/**
 * 싱글스레드 프로그램에서는 한 개의 스레드가 객체를 독차지해서 사용하면 되지만, 멀티 스레드 프로그램에서는 스레드들이 객체를 공유해서 작업해야 하는 경우가 있다.
 * 이 경우에서는 스레드 A를 사용하던 객체가 스레드 B에 의해 상태가 변경될 수 있기 때문에 스레드 A가 의도했던 것과는 다른 결과를 산출할수도 있다.
 * 각각 50 50이 나온다.
 */
public class MainThreadExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(); // 같이 공유하는 계산기를 생성
        User1 user1 = new User1(); // User1 스레드 생성
        user1.setCalculator(calculator); // 공유 객체 설정
        user1.start();

        User2 user2 = new User2(); // User2 스레드 생성
        user2.setCalculator(calculator); // 공유 객체 설정
        user2.start();
    }
}
