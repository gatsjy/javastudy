/**
 * Created by Gatsjy on 2021-02-13
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
public class Student extends People{
    public int studentNo;

    public Student(String name, String ssn, int studentNo){
        super(name, ssn);
        this.studentNo = studentNo;
    }
}
