package network;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerExample extends Application {

    // 스레드풀인 ExecutorService 필드가 선언되어있다.
    ExecutorService executorService;
    ServerSocket serverSocket;

    // 연결된 클라이언트를 저장하는 List<Client> 타입의 connections 필드가 선언되어있다. 그리고 스레드에 안전한 Vector로 초기화했다.
    List<Client> connections = new Vector<Client>();
    
    void startServer(){
        // 서버 시작 코드
        executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );

        // ServerSocket 생성 및 포트 바인딩
        try{
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress("localhost", 5001));
        } catch (IOException e) {
            if(!serverSocket.isClosed()){
                stopServer();
            }
            return;
        }

/*        // 연결을 수락하는 코드
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Platform.runLater(()->{
                    //displayText("[서버 시작]");
                });
            }
        }*/
    }

    void stopServer(){
        // 데이터 통신 코드
    }

    ///////////////////////////////
    // UI 생성 코드
    javafx.scene.control.TextArea txtDisplay;
    javafx.scene.control.Button btnStartStop;

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        root.setPrefSize(500,300);

        txtDisplay = new javafx.scene.control.TextArea();
        txtDisplay.setEditable(false);
        BorderPane.setMargin(txtDisplay, new Insets(0,0,2,0));

        btnStartStop = new Button("start");
        btnStartStop.setPrefHeight(30);
    }

}
