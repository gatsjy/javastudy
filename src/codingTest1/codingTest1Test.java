package codingTest1;


public class codingTest1Test {

    public static void main(String[] args) {
        MyDate myDate = new MyDate(10,13,2020);
        myDate.isValid();

        Person PersonJ = new Person("J", 10000);
        Person PersonP = new Person("P", 20000);
        BeenCafe beenCafe = new BeenCafe(4500);
        StarCafe starCafe = new StarCafe(4000);

        PersonJ.takeStarCoffee(beenCafe);
        PersonP.takeStarCoffee(starCafe);

        PersonJ.ShowPersonState();
        PersonP.ShowPersonState();
    }
}
