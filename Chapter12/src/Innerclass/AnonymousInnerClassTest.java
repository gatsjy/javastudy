package Innerclass;

class Outer{

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(final int i){

        int num = 100;
        return new Runnable() {
            @Override
            public void run() {
                System.out.println(num);
                System.out.println(i);
                System.out.println(outNum);
                System.out.println(sNum);
            }
        };
    }

    Runnable runner = new Runnable() {
        @Override
        public void run() {
            System.out.println("test");
        }
    };
}

public class AnonymousInnerClassTest {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Runnable runnable = outer.getRunnable(50);
        outer.runner = new Runnable() {
            @Override
            public void run() {
                System.out.println("test");
            }
        };
        runnable.run();
    }
}
