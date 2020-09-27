package staticex;

public class StudentIdTest {

    public static void main(String[] args) {
        Student studentLee = new Student("Lee");
        //System.out.println("studentLee.serialNum = " + studentLee.serialNum);

        Student studentKim = new Student("Kim");
        //System.out.println("studentKim.serialNum = " + studentKim.serialNum);
        //System.out.println("studentKim.serialNum = " + studentKim.serialNum);

        System.out.println("studentKim.getStudentId() = " + studentKim.getStudentId());
        System.out.println("studentLee.getStudentId() = " + studentLee.getStudentId());
    }
}
