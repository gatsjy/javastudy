package object;

class Book implements Cloneable{
    String title;
    String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ToStringTest extends Object {

    public static void main(String[] args) throws CloneNotSupportedException {
        Book book = new Book("토지", "박경리");
        System.out.println(book);

        Book book2 = (Book)book.clone();
        System.out.println(book2);
    }
}
