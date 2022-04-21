package src11.Generic;
import java.util.ArrayList;

public class GenericTest {
    public static void main(String[] args) {
/*      ArrayList list = new ArrayList();//无泛型
        list.add("str");
        list.add(100);
        list.add(true);
        String str0 = (String) list.get(0); //无报错
        String str1 = (String) list.get(1); //报错*/

        ArrayList<String> list = new ArrayList<>();
        list.add("str");
      //  list.add(100); //报错
        String name = list.get(0);

    }
}
