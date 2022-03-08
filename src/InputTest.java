import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//jdk15
public class InputTest {
    public static void main(String[] args) {
        //方法一
        BufferedReader stdin1=new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
            System.out.print("请输入:");
            str = stdin1.readLine();//此处会出现io异常，使用try catch捕获
            System.out.println("您的输入是:"+str);
            //stdin1.close();这里本该关闭的，但是这里的关闭代码会关闭System.in使得后续的scanner无法使用System.in,详情可以在idea中
            //长按ctrl用鼠标单击close查看源代码
        } catch (IOException e) {
            e.printStackTrace();
        }
        //=========================================================================
        //方法二
        Scanner stdin2=new Scanner(System.in);
        System.out.print("请输入:");
        String str2=stdin2.next();//关于这里为什么不需要捕获异常:https://qa.1r1g.com/sf/ask/1908502291/
        System.out.println("您的输入是:"+str2);
        stdin2.close();//进行关闭操作方便JVM对对象资源进行管理
    }
}
