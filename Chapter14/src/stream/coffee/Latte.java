package stream.coffee;

public class Latte extends Decorator{

    Coffee coffee;
    public Latte(Coffee coffee) {
        super(coffee);
    }

    public void brewing(){
        super.brewing();
        System.out.println("Adding Milk");
    }
}
