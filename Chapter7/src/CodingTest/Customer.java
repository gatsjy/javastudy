package CodingTest;

// 클래스에서 상속의 의미
// 새로운 클래스를 정의 할 때 이미 구현된 클래스를 상속(inheritance) 받아서 속성이나 기능이 확장되는 클래스를 구현함
// 상속은 좀 더 일반적인 케이스가 있고 좀더 구체적인 기능이 있을때...
// 자바에서는 싱글 인헤리턴스만 가능하다.
// 상위 클래스는 하위클래스보다 일반적인 개념과 기능을 가진다.
public class Customer {

    protected int customerID;
    protected String customerName;
    // 하위클래스들은 이 변수에 접근할 수 있다.
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
        return customerID + "님의 등급은 " + customerGrade +"이고, 포인트는" + bonusPoint + "점 입니다.";
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
