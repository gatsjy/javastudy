package reperence;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "Lee");
        studentLee.setSubject("국어",100,"korea");
        studentLee.setSubject("수학",95,"math");

        studentLee.showStudentScore();

        Student studentKim = new Student(101, "Kim");
        studentKim.setSubject("국어",80, "korea");
        studentKim.setSubject("수학",99, "math");

        studentKim.showStudentScore();
    }
}
