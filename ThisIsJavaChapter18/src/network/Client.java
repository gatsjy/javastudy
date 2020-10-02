package network;

import java.net.Socket;

public class Client {
    Socket socket;

    Client(Socket socket){
        this.socket = socket;
        receive();
    }
    
    void receive() {
        // 데이터 받기 코드
    }
    
    void send(String data){
        // 데이터 전송 코드
    }
}
