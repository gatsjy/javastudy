package thisex;

public class PersonTest {

    public static void main(String[] args) {
        // this()를 통해서 디폴트 생성자의 "이름 없음" 이 들어가게 된다..
        Person personNoname = new Person();
        //personNoname.showInfo();
        Person p = personNoname.getSelf();
        p.showInfo();


        Person personLee = new Person("Lee", 20);
        //personLee.showInfo();
    }
}
