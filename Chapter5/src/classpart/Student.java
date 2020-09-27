package classpart;

public class Student {

    public int studentId;
    public String studentName;
    public String address;

    // 개발자가 기본 생성자를 구현 하고 안하고를 결정할 수 있다.
    public Student(){};

    public Student(String name){
        studentName = name;
    }

    public Student(int id, String name){
        studentId = id;
        studentName = name;
        address ="주소 없음";
    }
    public void showStudentInfo() {
        System.out.println("studentId = " + studentId);
        System.out.println("studentName = " + studentName);
        System.out.println("address = " + address);
    }
}
