package hiding;

import hiding.MyDate;

public class MyDateTest {

    public static void main(String[] args) {
        MyDate date = new MyDate();

        date.setYear(2019);
        date.setMonth(77);
        date.setDay(100);

        date.showDate();

        MyDate date2 =  new MyDate();

        // 위의 setYear와 아래는 다르다..
        date2.setYear(11);
    }
}
