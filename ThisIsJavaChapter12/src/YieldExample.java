/**
 * @author Gatsjy
 * @since 2020-10-09
 * realize dreams myself
 */
public class YieldExample {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        // ThreadA, ThreadB 모두 실행
        threadA.start();
        threadB.start();

        System.out.println("===============1=================");
        try{Thread.sleep(3000);}catch (InterruptedException e){}
        // Thread B만 실행
        threadA.work = false;

        System.out.println("===============2=================");
        try{Thread.sleep(3000);}catch (InterruptedException e){}
        // ThreadA, ThreadB 모두 실행
        threadA.work = true;

        System.out.println("===============3=================");
        try{Thread.sleep(3000);}catch (InterruptedException e){}
        // ThreadA, ThreadB 모두 종료
        threadA.stop = true;
        threadB.stop = true;
    }
}
