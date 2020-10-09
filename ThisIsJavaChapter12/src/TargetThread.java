/**
 * @author Gatsjy
 * @since 2020-10-09
 * realize dreams myself
 */
public class TargetThread extends Thread {
    public void run(){
        // RUNNABLE 상태를 유지한다.
        for(long i = 0 ; i < 1000000000; i++){}
        
        try{
            // 1.5초간 일시 정지
            // TIMED_WAITING 상태를 유지한다.
            Thread.sleep(2000);
        } catch (Exception e){}

        // RUNNABLE 상태를 유지한다.
        for(long i = 0 ; i <1000000000; i++) {}
    }
}
