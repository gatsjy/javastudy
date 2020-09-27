package codingTest1;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public boolean IsValid;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 0 || month > 12) {
            this.IsValid = false;
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isValid() {
        if (!IsValid) {
            System.out.println("유효하지 않은 날짜 형식입니다");
            return false;
        }
        return true;
    }
}
