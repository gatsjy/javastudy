package network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try{
            serverSocket = new ServerSocket();
            // 포트 바인딩을 해준다.
            serverSocket.bind(new InetSocketAddress("localhost", 5001)); // ServerSocket 생성
            while (true){
                System.out.println("[연결 기다림]");
                Socket socket = serverSocket.accept();
                // 연결된 클라이언트의 ip와 포트정보를 알고 싶다면 Socket의 getRemoteSocketAddress() 메소드를 호출하면 된다.
                InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
                System.out.println("[연결 수락함] " + isa.getHostName());

                byte[] bytes = null;
                String message = null;

                InputStream is = socket.getInputStream();
                bytes = new byte[100];
                int readByteCount = is.read(bytes);
                message = new String(bytes, 0, readByteCount, "UTF-8");
                System.out.println("[데이터 받기 성공]: " + message);

                OutputStream os = socket.getOutputStream();
                message = "Hello Client";
                bytes = message.getBytes("UTF-8");
                os.write(bytes);
                os.flush();
                System.out.println("[데이터 보내기 성공]");

                is.close();
                os.close();
                socket.close();
            }
        } catch (IOException e) {}
        if(!serverSocket.isClosed()){
            try{
                serverSocket.close();
            }catch (IOException e){

            }
        }
    }
}
