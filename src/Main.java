import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
          // 冒泡排序
//        int[] a = {2, 6, 1, 7, 0};
//        Sort.sortBubble(a);
//        System.out.println(Arrays.toString(a));

        // 理解构造方法和this的用法
//        Person per = new Person("张三", 190.3f);
//        per.name = "张三";
//        per.age = -30;
//        per.tell();

        //理解异常机制
        double score;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的考试成绩：");
        try {
            score = input.nextDouble(); // 获取成绩
            if(score < 0) {
              throw new MyException("成绩为负！");
            } else if(score > 100) {
                throw new MyException("你的优秀已经溢出了！");
            } else {
                System.out.println("你的成绩为："+score);
         }
        } catch(InputMismatchException e1) {
            System.out.println("输入的成绩不是数字！");
        } catch(MyException e2) {
        System.out.println(e2.getMessage());
        }
    }
}
