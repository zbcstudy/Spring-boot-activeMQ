package com.fyp.layim.util.socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTest {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.baidu.com",80);
            InetAddress inetAddress = socket.getInetAddress();
            System.out.println(inetAddress);
            System.out.println(new Socket("localhost",61616).getInetAddress());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
