package fileRW;
import java.io.*;
//https://juejin.cn/post/6844903848167866375
public class Person implements Serializable {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //为了方便查看对象，重写默认的toString()
    @Override
    public String toString(){
        return "Person{" + "name='" + name + '\'' +   ", age=" + age +'}';
    }
}


