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
        Stream<String> stream = list.stream();
        stream.forEach(name -> System.out.println(name));
    }
}
