package fileRW;
import java.io.*;

public class ChartoByte {
    public static void main(String[] args) {
        try {
            //构建输出流字节对象
            FileOutputStream fileOutputStream = new FileOutputStream("E:\\test\\data4.txt");
            //构建输出流字节字符转换对象
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            //构建字符输出流对象
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            //构建数据
            char[] chars = new char[3];
            chars[0] = 'a';
            chars[1] = 'b';
            chars[2] = '中';

            //输出数据
            bufferedWriter.write(chars);

            //关闭流
            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
