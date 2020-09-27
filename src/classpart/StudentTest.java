package classpart;

public class StudentTest {

    // 힙에 올려진 메모리를 인스터스라고 명명한다.
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentName = "한주안";
        studentLee.address = "서울";

        studentLee.showStudentInfo ();

        Student studentKim = new Student("김유신");
        studentKim.address ="경주";

        studentKim.showStudentInfo();

        // 참조 변수 값 출력
        System.out.println(studentKim);
        System.out.println(studentLee);
    }
}
