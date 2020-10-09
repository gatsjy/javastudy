/**
 * @author Gatsjy
 * @since 2020-10-09
 * realize dreams myself
 */
// 공유 객체
// 공유 객체를 사용할 때의 주의할 점에 대해서 설명한다.
public class Calculator {
    private int memory;

    public int getMemory(){
        return memory;
    }

    public void setMemory(int memory){
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.println(Thread.currentThread().getName() + ": " + this.memory);
    }
}
