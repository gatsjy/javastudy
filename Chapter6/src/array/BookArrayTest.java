package array;

public class BookArrayTest {

    public static void main(String[] args) {

        Book[] library = new Book[5];

        library[0] = new Book("A", "Author");
        library[1] = new Book("B", "Buthor");
        library[2] = new Book("C", "Cuthor");
        library[3] = new Book("D", "Duthor");
        library[4] = new Book("E", "Euthor");

        for(int i = 0 ; i < library.length; i++){
            System.out.println("library[i] = " + library[i]);
            library[i].showBookInfo();
        }
    }
}
