/**
 * @author Gatsjy
 * @since 2020-10-09
 * realize dreams myself
 */
public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();

        // sumThread.join() 이라는 메서드가 없으면
        // 메인스레드가 전부 계산하기 전에 값을 출력할 수 있으므로 0이 나올 수 있다 -> 컴퓨터 성능에 따라서 다르다.
        // 그러므로 잠시 sumThread가 종료할때까지 mainThread를 일시 정지 시켜주는 join()이 필요한 것이다.
        try{
            sumThread.join(); // sumThread가 종료할 때 까지 메인스레드를 일시 정지 시킴
        } catch (InterruptedException e){}

        System.out.println("1~100 합 : "+ sumThread.getSum());
    }
}
