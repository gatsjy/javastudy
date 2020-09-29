package Innerclass;

class OutClass {

    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass(){
        inClass = new InClass();
    }

    class InClass{
        int iNum = 100;

        void inTest(){
            System.out.println(num);
            System.out.println(sNum);
        }
    }
    public void usingInner(){
        inClass.inTest();
    }

    static class InStaticClass{
        int inNum = 100;
        static int sInNum = 200;
        void inTest(){
            System.out.println(inNum);
            System.out.println(sInNum);
            System.out.println(sNum);
        }

        static void sTest(){
            System.out.println(sInNum);
            System.out.println(sNum);
        }
    }
}
public class InnerTest {

    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.usingInner();

        // 이런 문법도 가능하다..
        OutClass.InClass myInClass = outClass.new InClass();
        myInClass.inTest();

        System.out.println("===============");

        //OutClass.InStaticClass sInClass =OutClass.new InStaticClass();
        // static은 인스턴스 생성없이 쓸 수 있다는 것이 중요하다
        myInClass.inTest();
        OutClass.InStaticClass.sTest();
    }
}
