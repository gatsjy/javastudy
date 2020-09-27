package staticex;

import java.util.Calendar;

public class CompanyTest {

    public static void main(String[] args) {

        // 1. private new로 생성되지 않는다.
        //Company company = new Company();

        // 2.
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println("company1 = " + company1);
        System.out.println("company2 = " + company2);

        // 3. 싱글톤 패턴으로 되어 있는 예시
        Calendar calendar = Calendar.getInstance();
    }
}
