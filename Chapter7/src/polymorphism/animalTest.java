package polymorphism;

class Animal{
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal{
    public void move(){
        System.out.println("사람이 움직입니다.");
    }
}

class Tiger extends Animal{
    public void move(){
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
}

class Eagle extends Animal{
    public void move(){
        System.out.println("독수리가 하늘을 날아갑니다.");
    }
}

public class animalTest {

    public static void main(String[] args) {

        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        animalTest test = new animalTest();
        test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);
    }

    // 들어오는 것은 animal인데?? 각각 다른 메서드가 실행됩니다.
    // 하나의 메서드를 통해서 다양한 구현을 꾀할 수 있다.
    // 하나의 코드가 다양한 구현을 할 수 있음 -> 다형성
    public void moveAnimal(Animal animal){
        animal.move();
    }
}
