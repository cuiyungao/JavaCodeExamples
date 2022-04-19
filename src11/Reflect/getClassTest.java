package src11.Reflect;
public class getClassTest {
    public static void main(String[] args) {
        Student Harry = new Student("Harry",11); //
        System.out.println(Harry.getClass());//获得类
        System.out.println(Harry.getClass().getName());//获得类名
    }
}