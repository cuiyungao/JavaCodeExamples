package src11.Reflect;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Constructor;

public class ConTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Student Harry = new Student("Harry Potter", 11);
        Class StudentClass = Harry.getClass();
        Constructor con = StudentClass.getConstructor(String.class, int.class);
        Student Ron = (Student)con.newInstance("Ron Weasley", 11);
        System.out.println(Ron);
    }
}
