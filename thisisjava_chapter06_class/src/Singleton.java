/**
 * Created by Gatsjy on 2021-02-12
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){} // 생성자를 private로 해서 외부에서 접근하지 못하도록 한다.

    static Singleton getInstance(){
        return singleton;
    }
}
