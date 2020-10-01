package stream;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {
    // 스트림은 중간 처리와 최종 처리를 할 수 있다.
    // 스트림은 컬렉션의 요소에 대한 중간 처리와 최종 처리를 수행 할 수 있는데, 중간 처리에서는 매핑, 필터링, 정렬을 수행하고
    // 최종 처리에서는 반복, 카운팅, 평균, 총합 등의 집계처리를 수행한다.
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
        );

        double avg = studentList.stream()
                // 중간 처리(학생 객체를 점수로 매핑)
                .mapToInt(Student::getScore)
                // 최종 처리(평균 점수)
                .average()
                .getAsDouble();

        System.out.println("평균 점수: "+ avg);
    }
}
