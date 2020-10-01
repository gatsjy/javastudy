package stream;

import org.omg.SendingContext.RunTime;

import java.util.Arrays;
import java.util.List;

public class SequencialVsParallelExample {
    // 요소 처리
    public static void work(int value){
        try{Thread.sleep(100);}catch (InterruptedException e){}
    }

    // 순차 처리
    public static long testSequencial(List<Integer> list){
        long start = System.nanoTime();
        list.stream().forEach((a) -> work(a));
        long end = System.nanoTime();
        long runTime = end - start;
        return runTime;
    }

    // 병렬 처리
    public static long testParallel(List<Integer> list){
        long start = System.nanoTime();
        list.stream().parallel().forEach((a)->work(a));
        long end = System.nanoTime();
        long runTIme = end-start;
        return runTIme;
    }

    public static void main(String[] args) {
        // 소스 컬렉션
        List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);

        long timeSequencial = testSequencial(list);
        long timeParallel = testParallel(list);

        if(timeSequencial < timeParallel){
            System.out.println("병렬이 더 빠름");
        }
    }
}
