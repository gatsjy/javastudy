package staticex;

public class Student {

    private static int serialNum = 1000;
    public int studentId;
    public String studentName;
    public String address;

    // 개발자가 기본 생성자를 구현 하고 안하고를 결정할 수 있다.
    public Student(){};

    public Student(String name){
        studentName = name;
        serialNum++;
        studentId = serialNum;
    }

    public Student(int id, String name){
        studentId = id;
        studentName = name;
        address ="주소 없음";
        serialNum++;
        studentId = serialNum;
    }
    public void showStudentInfo() {
        System.out.println("studentId = " + studentId);
        System.out.println("studentName = " + studentName);
        System.out.println("address = " + address);
    }

    public int getStudentId(){
        return studentId;
    }

    public static int getSerialNum() {
        int i = 0;
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student.serialNum = serialNum;
    }
}
