/**
 * @author Gatsjy
 * @since 2021-03-26
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */

class Tv{
    // Tv의 속성(멤버변수)
    String color;
    boolean power;
    int channel;
    
    // Tv의 기능(메서드)
    void power() {power = !power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}
}
public class TvTest {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        t1= new Tv();
        t1.channel = 7;
        t1.channelDown();
        System.out.println("현재 채널은 " +t1.channel + " 입니다. ");

        t2= new Tv();
        t2.channel = 7;
        t2.channelUp();
        System.out.println("현재 채널은 " +t2.channel + " 입니다. ");
    }
}
