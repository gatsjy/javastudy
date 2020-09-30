package CodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TravelerTest {

    public static void main(String[] args) {
        List<Traveler> travelerList = new ArrayList<Traveler>();
        Traveler customerLee = new Traveler("이순신", 40, 100);
        Traveler customerKim = new Traveler("김유신", 20, 100);
        Traveler customerHong = new Traveler("홍길동", 13, 50);
        travelerList.add(customerLee);
        travelerList.add(customerKim);
        travelerList.add(customerHong);

        // stream API를 이용한 방식
        //myList.stream()
        //        .filter(s -> s.startsWith("c"))
        //        .map(String::toUpperCase)
        //        .forEach(System.out::println);

        // 1. 고객의 명단을 출력합니다.
        // map 이 select 이고 filter 가 where 이다. -> c#과 대응 시키자
        // 1.1 나의 답
        travelerList.stream()
                    .map(s->s.getName())
                    .forEach(System.out::println);
        // 1.2 해설 풀이
        travelerList.stream().map(c->c.getName()).forEach(s-> System.out.println(s));

        //System.out.println(Arrays.stream(arr).reduce(0,(a, b) -> a+b));
        // 2. 여행의 총 비용을 계산합니다.
        System.out.println(travelerList.stream().map(s->s.getPrice()).reduce(0, (a,b)->a+b));

        // 3. 고객 중 20세 이상인 사람을 이름순으로(가나다순)정렬하여 출력합니다.
        travelerList.stream()
                    .filter(s-> s.getAge() >= 20)
                    .map(s->s.getName())
                    .sorted()
                    .forEach(System.out::println);
    }

}
