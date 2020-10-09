/**
 * @author Gatsjy
 * @since 2020-10-09
 * realize dreams myself
 */

/**
 * 스레드 객체를 생성하고, start() 메서드를 호출하면 곧바로 스레드가 실행되는 것처럼 보이지만 사실은 실행 대기 상태가 된다.
 * 실행대기 상태란 아직 스케줄링이 되지 않아서 실행을 기다리고 있는 상태를 말한다.
 * 실행대기 상태에 있는 스레드 중에서 스레드 스케줄링으로 선택된 스레드가 비로서 CPU를 점유하고 run() 메소드를 실행한다. -> 이때를 실행(Running)상태 라고 한다.
 * 실행상태의 스레드는 run() 메소드를 모두 실행하기 전에 스레드 스케줄링에 의해 다시 실행 대기 상태로 돌아갈 수 있다.
 * 그리고 실행 대기 상태에 있는 다른 스레드가 선택되어 실행 상태가 된다.
 * 이렇게 스레드는 실행 대기 상태와 실행상태를 번갈아 가면서 자신의 run() 메소드를 조금씩 실행한다.
 *  NEW : 스레드 객체 생성, 아직 start() 메소드가 호출되지 않은 상태
 *  RUNNABLE : 실행상태로 언제든지 갈 수 있는 상태
 *  WAITING : 다른 스레드가 통지할 때까지 기다리는 상태
 *  TIME_WAITING : 주어진 시간 동안 기다리는 상태
 *  BLOCKED : 사용하고자 하는 객체의 락이 풀릴 때까지 기다리는 상태
 *  TERMINATED : 실행을 마친 상태
 */
public class StatePrintThread extends Thread {
    private Thread targetThread;

    // 상태를 조사할 스레드
    public StatePrintThread(Thread targetThread){
        this.targetThread = targetThread;
    }

    public void run(){
        while(true){
            Thread.State state = targetThread.getState();
            System.out.println("타겟 스레드의 상태 : " + state);

            if(state == Thread.State.NEW){
                targetThread.start(); // 객체 생성 상태일 결우 실행 대기 상태로 만듬
            }

            if(state == State.TERMINATED){
                break;
            }
            try{
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}
