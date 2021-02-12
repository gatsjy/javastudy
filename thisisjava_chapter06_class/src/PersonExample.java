/**
 * Created by Gatsjy on 2021-02-12
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123456-1123456","계백");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        //p1.nation="usa"; // final은 수정 불가
    }
}
