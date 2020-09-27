package hiding;

public class MyDate {

    // 외부에서 클래스 내부의 정보에 접근하지 못하도록 하는 기능
    // pubic 모두 오픈하겠다.
    // private 클래스 외부에서는 접근 할 수 없음
    // protected
    private int day;
    private int month;
    private int year;

    private boolean isValid;

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getDay(){
        return day;
    }

    // 자기 자신의 메모리를 가리키는 this
    public void setDay(int day){
        this.day = day;
    }

    public void setMonth(int month){
        if(month < 1 || month > 12){
            isValid = false;
        }
        this.month = month;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void showDate(){
        if(isValid){
            System.out.println(year + "년 " + month + "월 "+ day + "일 입니다.");
        }else {
            System.out.println("유효하지 않은 메서드 입니다.");
        }
    }
}
