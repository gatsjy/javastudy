/**
 * Created by Gatsjy on 2021-02-12
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
public class SingletonExample {

    public static void main(String[] args) {

        //Singleton obj1 = new Singleton();

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1.equals(singleton2));
    }
}
