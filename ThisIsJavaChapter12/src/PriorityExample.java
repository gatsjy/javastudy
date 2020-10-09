/**
 * @author Gatsjy
 * @since 2020-10-09
 * realize dreams myself
 */
// 우선순위를 설정해서 스레드 실행
// 멀티스레드는 동시성(Concurrenct) 또는 병렬성(Parallelism)으로 실행되기 때문에 이 용어들에 대해 정확히 이해하는 것이 좋다.
// 동시성은 멀티 작업을 위해 하나의 코어에서 멀티 스레드가 번갈아가며 실행하는 성질을 말한다.
// 병렬성은 멀티 작업을 위해 멀티코어에서 개별 스레드를 동시에 실행하는 성질을 말한다.
// 자바의 스레드 스케줄링은 우선순위(Priority) 방식과 순환할당(Round-Robin) 방식을 사용한다. 우선순위 방식은 우선순위가 높은 스레드가 실행 상태를 더 많이 가지도록 스케줄링 하는 것을 말한다.
// 순환할당 방식은 시간 할당량을 정해서 하나의 스레드를 정해진 시간만큼 실행하고 다시 다른 스레드를 실행하는 방식을 말한다.
public class PriorityExample {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            Thread thread = new CalcThread("Thread" + i);
            if(i != 10){
                thread.setPriority(Thread.MIN_PRIORITY); // 가장 낮은 우선순위를 할당
            }else if ( i == 10){
                thread.setPriority(Thread.MAX_PRIORITY);
            }
            thread.start();
        }
    }
}
