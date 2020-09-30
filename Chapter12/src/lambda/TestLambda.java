package lambda;

import java.util.Arrays;
import java.util.List;

public class TestLambda {

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("c1", "a2","b3","4","5");

        // 기존 방식
        for(int i = 0 ; i < myList.size(); i++){
            String s = myList.get(i);
            if(s.startsWith("c")){
                System.out.println(s.toUpperCase());
            }
        }

        System.out.println("================ stream API를 이용한 방식 ==================");
        // stream API를 이용한 방식
        myList.stream()
              .filter(s -> s.startsWith("c"))
              .map(String::toUpperCase)
              .forEach(System.out::println);
    }
}
