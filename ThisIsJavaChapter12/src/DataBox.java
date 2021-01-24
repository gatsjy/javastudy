/**
 * @author Gatsjy
 * @since 2020-10-09
 * realize dreams myself
 */
public class DataBox {
    private String data;

    public synchronized String getData(){
        if(this.data == null){ // data 필드가 null이면 소비자 스레드를 일시정지상태로 만든다(일단 값이 있어야 하므로..)
            try{
                wait();
            } catch (InterruptedException e){}
        }
        String returnValue = data;
        System.out.println("ConsumerThread가 읽은 데이터: " + returnValue);
        data = null;
        return returnValue;
    }
}
