import java.util.InputMismatchException;
import java.util.Scanner;

public class exception_eg {
    public static void main(String[] args) {
        int score;
        Scanner input=new Scanner(System.in);
        System.out.print("请输入你的考试成绩:");
        try{
            score=input.nextInt();//获取成绩
            if(score < 0){
                throw new MyException("成绩为负");
            }else if(score > 100){
                throw new MyException("你的优秀已经溢出了!");
            }else{
                System.out.println("你的成绩为:"+score);
            }
        }catch (InputMismatchException e1){
            System.out.println("输入的成绩不是数字！");
        }catch (MyException e2){
            System.out.println(e2.getMessage());
        }
    }
    //这个代码已经在src中写过了
    //关于exception的使用，是一种将异常集中管理的思想
    //如果不使用这样的作法，就会出现以下代码模式
//    if(exception1){
//        ...
//        ...
//    }else{
//        if(exception2){
//            ...
//            ...
//        }else{
//            if(exception3){
//                ...
//                ...
//            }else{
//                ...
//                ...
//            }
//        }
//    }
    //这样的代码模式使得代码不好管理
}
