package src12.SocketTest;

import java.io.*;
import java.net.*;
import java.util.*;


public class Send implements Runnable{
    Socket s ;
    Scanner in = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public Send(Socket s){
        this.s = s;
    }
    public void run() {
        // TODO Auto-generated method stub
        PrintWriter out = null;
        try {
            while(true){
                out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()),true);
                String str = in.nextLine();
                //br.readLine();
                out.println(str);

            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            out.close();
        }

    }
}
