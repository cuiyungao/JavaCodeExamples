package collection;
import java.util.*;

public class ArraylistTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        //增加元素
        sites.add("Google");
        sites.add("Amazon");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.add(1,"Baidu");
        System.out.println(sites);

        //删除元素
        sites.remove(3);
        sites.remove("Google");
        System.out.println("After removal, " + sites);

        //查询元素
        System.out.println(sites.get(1));

        //修改元素
        sites.set(1, "Jingdong");
        System.out.println("After modification, " + sites);

        //遍历
        // for循环遍历
        for (int i=0; i<sites.size(); i++){
            System.out.println(sites.get(i));
        }
        // for each遍历
        System.out.println("--------for each遍历---------");
        for (String i: sites){ //泛型的时候需要修改成Object
            System.out.println(i);
        }
    }
}
