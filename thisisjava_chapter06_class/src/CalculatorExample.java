/**
 * Created by Gatsjy on 2021-02-12
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
public class CalculatorExample {
    public static void main(String[] args) {
        double result1 = 10 * 10 * Calculator.pi; // 인스턴스를 생성하지 않아도 바로 끌어다 쓸 수 있다.
        System.out.println(result1);
        int result2 = Calculator.plus(10,5);
        int result3 = Calculator.minus(10,5);

        System.out.println(result2);
        System.out.println(result3);
    }
}
