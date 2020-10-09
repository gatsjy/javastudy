import java.awt.*;

/**
 * @author Gatsjy
 * @since 2020-10-09
 * realize dreams myself
 */
public class BeepPrintExample2 {
    public static void main(String[] args) {
        // 람다식을 이용해서 스레드 시작하기
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit defaultToolkit = Toolkit.getDefaultToolkit();
                for(int i = 0 ; i < 5; i++){
                    defaultToolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();

        // 이렇게 코딩하면 컴퓨터의 음과 띵이라는 소리를 같이 출력할 수 있다.
        for(int i = 0 ; i < 5; i++){
            System.out.println("띵");
            try{Thread.sleep(500);}catch (Exception e){}
        }
    }
}
