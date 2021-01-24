/**
 * @author Gatsjy
 * @since 2020-10-09
 * realize dreams myself
 */
// 두 스레드의 작업 내용을 동기화 메소드로 작성한 공유 객체
public class WorkObject {
    public synchronized void methodA(){
        System.out.println("ThreadA의 MethodA() 작업 실행");
        notify(); // 일시 정지 상태에 있는 ThreadB를 실행 대기 상태로 만듬
        try{
            wait(); // ThreadA를 일시 정지 상태로 만듬
        } catch (InterruptedException e){}
    }

    public synchronized void methodB(){
        System.out.println("ThreadB의 MethodB() 작업 실행");
        notify(); // 일시 정지 상태에 있는 ThreadA를 실행 대기 상태로 만듬
        try{
            wait(); // ThreadB을 일시 정지 상태로 만듬
        } catch (InterruptedException e){}
    }
}
