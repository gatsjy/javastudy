import java.awt.*;

/**
 * @author Gatsjy
 * @since 2020-10-09
 * realize dreams myself
 */
public class BeepPrintExample1 {

    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체 얻기
        
        // 1. 띠용 소리를 낸다
        for(int i = 0 ; i < 5; i++){
            toolkit.beep();
            try{ Thread.sleep(5000);} catch (Exception e){}
        }

        // 2. 띵 출력한다.
        for(int i = 0 ; i < 5; i++){
            System.out.println("띵");
            try {Thread.sleep(500);}catch (Exception e){}
        }
    }
}
