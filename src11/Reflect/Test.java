package Reflect;

import java.util.Date; // 先有类

public class Test {
    public static void main(String[] args) {
        Date date = new Date(); // 后有对象
        System.out.println(date);
        System.out.println(date.getClass());//反射
        System.out.println(date.getClass() == date.getClass()); // true 每个类只有一个Class对象
    }
}