import java.awt.*;

/**
 * @author Gatsjy
 * @since 2020-10-09
 * realize dreams myself
 */
public class BeepTask implements Runnable {
    public void run(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0 ; i < 5 ; i++){
            toolkit.beep();
            try{Thread.sleep(500);}catch (Exception e){}
        }
    }
}
