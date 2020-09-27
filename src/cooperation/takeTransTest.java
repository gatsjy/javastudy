package cooperation;

public class takeTransTest {

    public static void main(String[] args) {
        Student studentJ = new Student("juan", 5000);
        Student studentA = new Student("arin", 10000);

        Bus bus100 = new Bus(100);
        Bus bus200 = new Bus(200);
        Subway subway5 = new Subway(5);
        Subway subway3 = new Subway(3);

        studentA.takeBus(bus100);
        studentJ.takeSubway(subway5);

        studentA.showInfo();
        studentJ.showInfo();

        bus100.showBusInfo();
        bus200.showBusInfo();
        subway3.showSubwayInfo();
        subway5.showSubwayInfo();
    }
}
