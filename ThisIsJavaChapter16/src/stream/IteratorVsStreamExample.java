package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동","한주안","김자바");
        
        //Iterator 이용
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

        System.out.println();
        
        //Stream 이용
        //Stream을 이용하면 같은 코드라도 더욱 간결하게 표현 할 수 있다.
        //Stream은 iterator과 비슷한 역할을 하는 반복자이지만 ,람다식으로 요소 처리 코드를 제공하는 점과 내부 반복자를 사용하므로
        //병렬처리가 쉽다는 점 그리고 중간 처리와 최종 처리 작업을 수행하는 점애서 많은 차이를 가지고 있다. 이 특징에 대해 살펴보자
        Stream<String> stream = list.stream();
        stream.forEach(name -> System.out.println(name));
    }
}
