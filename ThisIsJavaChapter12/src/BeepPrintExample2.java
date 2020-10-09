import java.awt.*;

/**
 * @author Gatsjy
 * @since 2020-10-09
 * realize dreams myself
 */
public class BeepPrintExample2 {
    public static void main(String[] args) {

        BeepThread thread = new BeepThread();
        thread.start();

        // 이렇게 코딩하면 컴퓨터의 음과 띵이라는 소리를 같이 출력할 수 있다.
        for(int i = 0 ; i < 5; i++){
            System.out.println("띵");
            try{Thread.sleep(500);}catch (Exception e){}
        }
    }
}
