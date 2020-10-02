package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {
    public static void main(String[] args){
        System.out.println("입력:");

        System.out.println("입력 후 '끝' 이라고 쓰세요:");
        try {
            int i;
            // 두 글자씩 읽기 위해서..
            InputStreamReader isr = new InputStreamReader(System.in);
            while( (i = isr.read()) != '끝'){
                System.out.println((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
