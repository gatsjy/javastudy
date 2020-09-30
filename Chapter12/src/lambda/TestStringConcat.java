package lambda;

public class TestStringConcat {

    public static void main(String[] args) {
        StringConImpl impl = new StringConImpl();
        impl.makeString("hello", "world");

        StringConcat concat = (s,v) -> System.out.println(s + ", "+v);
        concat.makeString("hello", "world");

        // 이렇게 내부클래스가 생성되어진다 (위에 람다식으로 작성 할 시에..)
        StringConcat concat2 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 +", "+ s2);
            }
        };

        concat2.makeString("hello", "world");
    }
}
