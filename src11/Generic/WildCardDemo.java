package Generic;
import java.util.ArrayList;

public class WildCardDemo {
    public static void printAllObject(ArrayList<?> list) {
        for (Object object : list) {
            System.out.println(object);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("java");
        printAllObject(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(7);
        printAllObject(list2);
    }
}
