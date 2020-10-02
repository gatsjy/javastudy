package stream.outputstream;

import java.io.*;

public class FileOutputTest1 {
    public static void main(String[] args) {

        byte[] bs = new byte[26];
        byte data = 65;
        for(int i = 0; i < bs.length; i++){
            bs[i] = data;
            data++;
        }
        try(FileOutputStream fos = new FileOutputStream("alpha.txt", true);
            FileInputStream fis = new FileInputStream("alpha.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos)){
            
            // 쓰기
            fos.write(bs);

            int ch;
            while( (ch = bis.read()) != -1){
                System.out.print ((char)ch);
            }
            
        } catch (IOException e) {
            System.out.println(e); // 시간 : 36353
        }
    }
}
