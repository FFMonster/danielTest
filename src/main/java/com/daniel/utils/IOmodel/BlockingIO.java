package com.daniel.utils.IOmodel;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class BlockingIO {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("服务端Start.....");
            while (true){
                Socket socket = serverSocket.accept();
                System.out.println("发现客户端连接...");
                InputStream is = socket.getInputStream();
                byte[] b = new byte[1024];
                //等待客户端发送请求  ->  阻塞
                while (true){
                    int data = is.read(b);
                    String info = null;
                    if (data != -1){
                        info = new String(b,0,data,"GBK");
                    }
                    System.out.println(info);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
