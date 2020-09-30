package lambda;

@FunctionalInterface // 메서드를 하나만 생성 할 수 있다.
public interface MyMaxNumber {
    int getMaxNumber(int x, int y);
}
