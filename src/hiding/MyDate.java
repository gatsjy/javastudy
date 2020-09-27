package hiding;

public class MyDate {

    // 외부에서 클래스 내부의 정보에 접근하지 못하도록 하는 기능
    // pubic 모두 오픈하겠다.
    // private 클래스 외부에서는 접근 할 수 없음
    // protected
    private int day;
    private int month;
    private int year;

    public void setDay(int day){
        this.day = day;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void showDate(){
        System.out.println(year + "년 " + month + "월 "+ day + "일 입니다.");
    }
}
