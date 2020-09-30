package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

interface PrintString{
    void showString(String str);
}

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

        System.out.println("====================================================================");

        PrintString labdaStr = s-> System.out.println(s);
        labdaStr.showString("Test");

        showMyString(labdaStr);

        PrintString test = returnString();
        test.showString("Test3");
    }

    public static void showMyString(PrintString p){
        p.showString("Test2");
    }

    public static PrintString returnString(){
        return s->System.out.println(s + "!!!");
    }
}
