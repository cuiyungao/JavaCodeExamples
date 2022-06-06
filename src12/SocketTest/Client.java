package src12.SocketTest;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        BufferedReader br = null;
        String clientStr="";
        try {
            //建立通信端口，并向服务器端发送通信请求
            Socket s = new Socket("127.0.0.1",3838);
            System.out.println("与服务器端建立连接");
            Send send = new Send(s);
            Thread t1 = new Thread(send);
            t1.start();
            while(true){

                //获取客户端通信的信息
                br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                clientStr = br.readLine();
                System.out.println("服务器端说："+clientStr);
            }

        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
