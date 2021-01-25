package inheritance;

// 클래스와 객체와 인스턴스의 차이는?
// -- 클래스 : 객체를 만들어 내기 위한 설계도, 변수와 메서드의 집합
// -- 객체 : 소프트웨어 안에서 타겟으로 하는 구현 할 대상
// -- 인스턴스 : 설계도를 바탕으로 구현된 실제적인 실체
public class Customer {

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    /*
    public Customer(){
        customerGrade = "SILVER";
        bonusRatio = 0.01;

        System.out.println("Customer() 생성자 호출");
    }*/

    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;

        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("Customer(int, String) 생성자 호출");
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo(){
        return customerID + "님의 등급은 " + customerGrade +"이고, 포인트는 " + bonusPoint + "점 입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }
}
