package thread;

import java.sql.Struct;
import java.util.ArrayList;

class FastLibrary{
    public ArrayList<String> books = new ArrayList<String>();

    public FastLibrary(){
        books.add("태백 산맥 1");
        books.add("태백 산맥 2");
        books.add("태백 산맥 3");
       //books.add("태백 산맥 4");
       //books.add("태백 산맥 5");
       //books.add("태백 산맥 6");
    }

    public synchronized String lendBook() throws InterruptedException {

        Thread t = Thread.currentThread();
        // notify로 깨우면 다시 할당받지 못한 것은 다시 재운다.
        while(books.size() == 0) {
            System.out.println(t.getName() + " waiting start");
            wait(); // 원하는 책이 없으면 스레드를 종료하지 않고 기다리겠다.
            System.out.println(t.getName() + " waiting end");
        }
        String title = books.remove(0);
        System.out.println(t.getName() + ":" + title + " lend");
        return title;
    }

    public synchronized void returnBook(String title){
        Thread t = Thread.currentThread();
        books.add(title);
        notifyAll(); // 원하는 책이 들어오면 기다린 스레드를 깨운다
        System.out.println(t.getName() + ":" + title + " return");
    }
}

class Student extends Thread{
    public void run(){

        try {
            String title = LibraryMain.library.lendBook();
            if(title==null) return;
            sleep(5000);
            LibraryMain.library.returnBook(title);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class LibraryMain {
    public static FastLibrary library = new FastLibrary();

    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student();
        Student std3 = new Student();
        Student std4 = new Student();
        Student std5 = new Student();
        Student std6 = new Student();

        std1.start();
        std2.start();
        std3.start();
        std4.start();
        std5.start();
        std6.start();
    }
}
