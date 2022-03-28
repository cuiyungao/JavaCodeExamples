package collection;
import java.util.*;

public class HashsetTest {
    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<>();
        //添加元素，无序
        sites.add("Google");
        sites.add("Amazon");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);

        //判断元素是否存在
        System.out.println(sites.contains("Weibo"));

        //删除元素
        sites.remove("Weibo");
//        sites.clear();

        //遍历（重点）
        System.out.println("----------1.遍历元素foreach----------");
        for (String i: sites){
            System.out.println(i);
        }

        System.out.println("----------2.迭代器遍历----------");
        Iterator<String> it = sites.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
