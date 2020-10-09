/**
 * @author Gatsjy
 * @since 2020-10-09
 * realize dreams myself
 */
// 스레드의 우선순위를 공부할 수 있는 예제
public class CalcThread extends Thread{
    public CalcThread(String name){
        setName(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + "is start");
        for(int i = 0 ; i < 200000000; i++){

        }
        // 끝나면 자신의 이름을 리턴한다.
        System.out.println(getName() + "is end");
    }
}
