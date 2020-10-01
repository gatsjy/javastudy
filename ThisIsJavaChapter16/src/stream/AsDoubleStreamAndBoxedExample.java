package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.Comparator.*;

public class AsDoubleStreamAndBoxedExample {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        IntStream intStream = Arrays.stream(intArray);
        intStream
                .asDoubleStream()
                .forEach(System.out::println);

        System.out.println();

        intStream = Arrays.stream(intArray);
        intStream
                .boxed()
                .forEach(obj -> System.out.println(obj.intValue()));

        IntStream intStream1 = Arrays.stream(new int[]{5, 3, 2, 1, 4});
        intStream1
                .sorted()
                .forEach(n -> System.out.println(n + ", "));

        System.out.println();

        // 객체 요소 일 경우
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 30),
                new Student("신용권", 10),
                new Student("유미선", 20)
        );

        studentList.stream()
                .sorted()
                .forEach(s -> System.out.println(s.getScore() + ","));
        System.out.println();

        /*studentList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.println(s.getScore() + ","));*/
    }
}
