package Reflect;
import java.util.Random;
public class forNameTest {
    public static void main(String[] args) throws ClassNotFoundException {
        String className = "java.util.Random";
        Class cl1 = Class.forName(className); //Class.forName
        System.out.println(cl1);
        Class cl2 = Random.class; //T.class
       // Class cl2 = int.class; //T.class
        System.out.println(cl2);
    }
}
