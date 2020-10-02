package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("writer.txt");
        fw.write('A');
        char[] buf = {'B', 'C', 'D', 'E', 'F'};
        fw.write(buf);
        fw.write("나는 한주안이라고해");
        fw.write(buf, 2,2);
        fw.close();
    }
}
