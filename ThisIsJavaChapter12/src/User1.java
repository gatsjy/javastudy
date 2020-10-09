/**
 * @author Gatsjy
 * @since 2020-10-09
 * realize dreams myself
 */
public class User1 extends Thread{
    private Calculator calculator;

    public void setCalculator(Calculator calculator){
        this.setName("User1");
        this.calculator = calculator;
    }

    public void run(){
        calculator.setMemory(100);
    }
}
