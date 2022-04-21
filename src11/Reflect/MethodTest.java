package src11.Reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodTest {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Student Harry = new Student("Harry Potter", 11);
        Method m = Student.class.getMethod("getName");
        String n = (String) m.invoke(Harry);
        System.out.println(n);
    }
}

