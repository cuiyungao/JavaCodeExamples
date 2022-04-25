package src12.SocketTest;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        BufferedReader br = null;
        String clientStr="";
        try {
            //创建一个监听的端口
            ServerSocket ss = new ServerSocket(3838);
            Socket s = null;
            System.out.println("服务器启动...");
            //接受客户端通信请求，并建立专用通信端口
            s = ss.accept();
            System.out.println("有客户端发送请求");
            Send send = new Send(s);
            Thread t1 = new Thread(send);
            t1.start();
            while(true){
                //获取客户端通信的信息
                br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                clientStr = br.readLine();
                System.out.println("客户端："+clientStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
