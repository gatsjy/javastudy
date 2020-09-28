package CodingTest;

import java.util.Objects;

class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return day == myDate.day &&
                month == myDate.month &&
                year == myDate.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}

public class MyDateTest{
    public static void main(String[] args) {

        MyDate date1 = new MyDate(10, 12,2020);
        MyDate date2 = new MyDate(10, 12,2020);

        System.out.println(date1.equals(date2));
    }
}
