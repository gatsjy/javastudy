package staticex;

public class Company {

    // 이 시스템 전체에서 유일한 친구이다.
    private static Company instance = new Company();

    // 외부에 오픈되는 생성자가 아니다.
    private Company(){}

    // 외부에서 가져다 쓸 수 있게 static으로 만든다.
    public static Company getInstance(){

        if(instance == null){
            instance = new Company();
        }
        return instance;
    }


}
