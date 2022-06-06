package urlTest;
import java.net.*;
import java.io.*;

public class UrlSite {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("没有给出URL");
            System.exit(1);
        } else {
            for (int i = 0; i < args.length; i++) {
                urlSite(args[i]);
            }
        }

    }

    public static void urlSite(String urlname) {
        String s;
        URL url = null;
        InputStream urlstream=null;
        try{
            url=new URL(urlname);
        }
        catch(Exception e){
            System.out.println("url名字错误");
        }
        try{
            urlstream=url.openStream();
            DataInputStream dat=new DataInputStream(urlstream);
            while(dat.readLine()!=null){
                System.out.println(dat.readLine());
            }
        }
        catch(IOException e){
            System.out.println("URL文件打开错误");
        }

    }
}