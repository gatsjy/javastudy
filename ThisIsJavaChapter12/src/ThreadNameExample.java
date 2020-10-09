/**
 * @author Gatsjy
 * @since 2020-10-09
 * realize dreams myself
 */
// 스레드의 이름을 알아 보는 연습
// 디버깅할 때 어떤 스레드가 어떤 작업을 하는지 조사할 목적으로 가끔 사용된다.
public class ThreadNameExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName());

        ThreadA threadA = new ThreadA();
        System.out.println("작업 스레드 이름 : "+threadA.getName());
        threadA.start();

        ThreadB threadB = new ThreadB();
        System.out.println("작업 스레드 이름 : "+threadB.getName());
        threadB.start();
    }
}
