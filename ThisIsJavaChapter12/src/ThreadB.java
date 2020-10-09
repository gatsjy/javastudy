/**
 * @author Gatsjy
 * @since 2020-10-09
 * realize dreams myself
 */
public class ThreadB extends Thread{

    public ThreadB(){
        setName("ThreadB");
    }
    @Override
    public void run() {
        for(int i = 0 ; i <2; i++){
            System.out.println("getName() = " + getName());
        }
    }
}
