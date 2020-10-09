/**
 * @author Gatsjy
 * @since 2020-10-09
 * realize dreams myself
 */

/**
 * 동기화 메소드 및 동기화 블록
 * 스레드가 사용 중인 객체를 다른 스레드가 변경할 수 없도록 하려면 스레드 작업이 끝날 때까지 객체에 잠금을 걸어서 다른 스레드가 사용할 수 없도록 해야한다.
 * 멀티스레드프로그램에서 단 하나의 스레드만 실핼 할 수 있는 코드 영역을 임계영역(critical section)이라고 한다.
 * 자바는 임계 영역을 지정하기 위해ㅔ 동기화(synchronized) 메소드와 동기화 블록을 제공한다.
 * 스레드가 객체 내부의 동기화 메소드 또는 블록에 들어가면 즉시 객체에 잠금을 걸어 다른 스레드가 임계 영역 코드를 실행하지 못하도록 한다.
 */
public class Calculator {
    private int memory;

    public int getMemory(){
        return memory;
    }

    // 여기서 synchronized 메소드를 쓰면 즉시 객체에 잠금을 걸어 다른 스레드가 임계 영역 코드를 실행하지 못하도록 한다.
    public synchronized void setMemory(int memory){
        // 임계영역 : 단 하나의 스레드만 실행
        // 실행되고 2초간 정지하는 동안에 다른 스레드가 이 메소드에 접근할 수 없다.
/*        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.println(Thread.currentThread().getName() + ": " + this.memory);*/

        // 다음과 같이 동기화 블록으로도 구현할 수 있다.
        synchronized (this){
            this.memory = memory;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getName() + ": " + this.memory);
        }
    }
}
