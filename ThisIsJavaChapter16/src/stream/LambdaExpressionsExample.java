package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 90),
                new Student("신용권", 92)
        );

        Stream<Student> stream = list.stream(); // 스트림 얻기
        // List 컬렉션에서 Student를 가져와 람다식의 매개값으로 적용
        stream.forEach(s -> {
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + " - " + score);
        });
        // 내부 반복자를 사용해서 얻는 이점은 컬렉션 내부에서 어떻게 요소를 반복시킬 것인가는 컬렉션에게 맡겨두고
        // 개발자는 요소 처리 코드에만 집중 할 수 있다는 것이다. 내부 반복자는 요소들의 반복순서를 변경하거나, 멀티코어 CPU를 최대한 활용하기 위해 요소들의 분배시켜 병렬작업을 할 수 있게 도와주기 때문에
        // 하나씩 처리하는 순차적 외부 반복자보다는 효울적으로 요소를 반복시킬 수 있다.
    }
}
