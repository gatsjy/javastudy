package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest3 {

    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("C:\\Users\\Gatsjy\\IdeaProjects\\javastudy\\Chapter14\\src\\input2.txt")) {
             int i;
             byte[] bs = new byte[10];

             while((i = fis.read(bs)) != -1){
                 for(int k = 0 ; k < i ; k++){
                     System.out.print((char)bs[k]);
                 }
                 System.out.println();
             }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
