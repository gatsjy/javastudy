import java.awt.*;

/**
 * @author Gatsjy
 * @since 2020-10-09
 * realize dreams myself
 */
// 작업 스레드가 실행할 작업을 Runnable로 만들지 않고, Thread의 하위 클래스로 작업 스레드를 정의하면서 작업 내용을 포함시킬 수도 있다.
// 다음은 작업 스레드 클래스를 정의하는 방법인데, Thread 클래스를 상속한 후 run 메소드를 재정의 (overriding)해서 스레드가 실행할 코드를 작성하면 된다.
public class BeepThread extends Thread{
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0 ; i < 5; i++){
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
