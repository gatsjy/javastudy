/**
 * Created by Gatsjy on 2021-02-12
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
public class Person {
    final String nation = "Korea";
    final String ssn;
    String name;

    // 생성하면서 final 값을 세팅하는 순간 변화시키지 못한다.
    public Person(String ssn, String name){
        this.ssn = ssn;
        this.name = name;
    }
}
