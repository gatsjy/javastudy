package array;

public class ObjectCopy {

    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("A", "Author");
        library[1] = new Book("B", "Buthor");
        library[2] = new Book("C", "Cuthor");
        library[3] = new Book("D", "Duthor");
        library[4] = new Book("E", "Euthor");

        System.arraycopy(library, 0, copyLibrary, 0, 5);

        for( Book book : copyLibrary){
            book.showBookInfo();
        }

        library[0].setTitle("나목");
        library[0].setAuthor("박원서");

        for(Book book : library){
            book.showBookInfo();
        }

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        for(int i = 0 ; i < copyLibrary.length; i++){
            copyLibrary[i] = library[i];
        }

        for( Book book : copyLibrary){
            book.showBookInfo();
        }
    }
}
