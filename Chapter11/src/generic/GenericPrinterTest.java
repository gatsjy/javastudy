package generic;

public class GenericPrinterTest {

    public static void main(String[] args) {
        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>();
        Powder power = new Powder();
        powderGenericPrinter.setMaterial(power);
        System.out.println(powderGenericPrinter);

        GenericPrinter<Plastic> plasticGenericPrinter = new GenericPrinter<>();
        Plastic plastic = new Plastic();
        plasticGenericPrinter.setMaterial(plastic);
        System.out.println(plasticGenericPrinter.toString());
    }
}
