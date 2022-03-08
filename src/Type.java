import java.io.*;
import java.util.*;

public class Type {

    public static void main(String[] args) {
        // 类型提升例子
//            int n = 5;
//            double d1 = (1.2 + 24.0)/n;
//            double d2 = 1.2 + 24 / 5;
//            double d3 = 24 / 5;
//
//        Typetester t = new Typetester();
//        System.out.println(d1);
//        t.printType(d1);
//        System.out.println(d2);
//        t.printType(d2);
//        System.out.println(d3);
//        t.printType(d3);
//        t.printType(24/5);

        //类型转换 -- 损失精度
//        int a = 123456789;
//        float f = a;
//        System.out.println(f);

        //字符串转换为数值
//        int x1 = Integer.parseInt("260");
//        float y = Float.parseFloat("23.5");
//        double z = Double.parseDouble("45.6");
//        System.out.printf("%d %.2f %.2f", x1, y, z); // 沿用C语言函数库中的printf方法

        //常量的声明
//        final double CM_PER_INCH = 2.54;

        // 标准输入
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name?");
        String name = in.nextLine();
        System.out.print("What is your student ID?");
        int id = in.nextInt(); //nextDouble
        System.out.println("Hello, "+name+", id " + id);

        //数组
//        int[] a = new int[5];
//        System.out.println(a.getClass().getName());
//        String[][] d = new String[5][5];
//        int[] d_new = new int[]{0,1};
//        System.out.println(d.getClass().getName());
//        System.out.println(Arrays.toString(d_new));

    }
}

class Typetester {
    void printType(byte x) {
        System.out.println(x + " is an byte");
    }
    void printType(int x) {
        System.out.println(x + " is an int");
    }
    void printType(float x) {
        System.out.println(x + " is an float");
    }
    void printType(double x) {
        System.out.println(x + " is an double");
    }
    void printType(char x) {
        System.out.println(x + " is an char");
    }
}