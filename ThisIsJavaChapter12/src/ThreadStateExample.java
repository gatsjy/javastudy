/**
 * @author Gatsjy
 * @since 2020-10-09
 * realize dreams myself
 */
public class ThreadStateExample {
    public static void main(String[] args) {
        StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
        statePrintThread.start();

    }
}
