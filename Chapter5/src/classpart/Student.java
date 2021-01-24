package classpart;

// 객체 (Object)
// 의사나 행위가 미치는 대상 (사전적 의미)
// 구체적, 추상적 데이터의 단위
// 예) 사람, 자동차, 주문, 생산, 관리
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
