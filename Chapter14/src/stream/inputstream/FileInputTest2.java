package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest2 {

    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("C:\\Users\\Gatsjy\\IdeaProjects\\javastudy\\Chapter14\\src\\input.txt")) {
             int i;
             while((i = fis.read()) != -1){
                 System.out.print((char)i);
             }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}