package network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket();
            System.out.println("[연결 요청]");
            socket.connect(new InetSocketAddress("localhost", 5001));
            System.out.println("[연결 성공]");

            // 데이터 보내고 받기
            byte[] bytes = null;
            String message = null;

            // 출력 스트림 얻기
            // 상대방에게 데이터를 보내기 위해서는 보낼 데이터를 byte[] 배열로 생성하고, 이것을 매개값으로해서
            // OutStream의 write()메소드를 호출하면 된다. 다음은 문자열을 UTF-8로 인코딩한 바이트 배열을 얻어내고,
            // Write() 메소드로 전송한다.
            OutputStream os = socket.getOutputStream();
            message = "Hello Server";
            bytes = message.getBytes();
            os.write(bytes);
            os.flush();
            System.out.println("[데이터 보내기 성공]");

            // 입력 스트림 얻기
            InputStream is = socket.getInputStream();
            bytes = new byte[100];
            int readByteCount = is.read(bytes);
            message = new String(bytes, 0, readByteCount, "UTF-8");
            System.out.println("[데이터 받기 성공]: " + message);

            os.close();
            is.close();
        } catch (IOException e) {}

        if(!socket.isClosed()){
            try{
                socket.close();
            } catch (IOException e1){}
        }
    }
}
