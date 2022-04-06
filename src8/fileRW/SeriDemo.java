package fileRW;
import java.io.*;
public class SeriDemo {
    public static void main(String[] args) {
        // ObjectOutputStream 流
        try {
            Person p1 = new Person("zhangsan", 30);
            System.out.println(p1);
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sample_files/person.dat"));
            oos.writeObject(p1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //创建一个ObjectInputStream输入流
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sample_files/person.dat"))){
            System.out.println("readObject()：");
            Person zhangsan = (Person) ois.readObject();
            System.out.println(zhangsan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}






//
//    public static void main(String[] args){
//        try {
//            Person p1= new Person("zhangsan", 30);
//            Person p2= new Person("lisi", 40);
//            System.out.println(p1);
//            System.out.println(p1);
//            Person[] plist = new Person[2];
//            plist[0] = p1;
//            plist[1] = p2;
//            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"));
//            oos.writeObject(plist);
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//        try {
//            //创建一个ObjectInputStream输入流
//            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat")))
//            Person plist = (Person[]) ois.readObject();
//            System.out.println(brady);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
