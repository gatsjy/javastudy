package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

    // 이렇게 처리하게 되면 이 메서드를 호출하는 곳에서 exception을 처리해야 합니다.
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args){
        ThrowsException test = new ThrowsException();

        try {
            test.loadClass("a.txt","java.lang.String");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println(e);
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println("end");
    }
}
