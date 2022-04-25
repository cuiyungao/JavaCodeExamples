package urlTest;
import java.net.*;
import java.io.*;

public class URLDemo {
    public static void main(String[] args) throws IOException {
        URL url=new URL("https://www.baidu.com/");
        BufferedReader reader=new BufferedReader(new InputStreamReader(url.openStream()));
        BufferedWriter writer=new BufferedWriter(new FileWriter("info.html"));
        String line;
        while((line = reader.readLine()) != null){
            System.out.println(line);
            writer.write(line);
            writer.newLine();
        }
        reader.close();
        writer.close();
    }
}
