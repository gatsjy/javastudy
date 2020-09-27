package codingTest1;

public class Person {

    private String name;
    private int money;

    public Person(String name, int money){
        this.name = name;
        this.money = money;
    }
    void takeStarCoffee(StarCafe starCafe){
        this.money -= starCafe.SaleCoffee();
    }

    void takeStarCoffee(BeenCafe beenCafe){
        this.money -= beenCafe.SaleCoffee();
    }

    void ShowPersonState(){
        System.out.println("money = " + money);
    }
}
