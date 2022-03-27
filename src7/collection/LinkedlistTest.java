package collection;
import java.util.*;

public class LinkedlistTest {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<>();
        //增加元素
        sites.add("Google");
        sites.add("Amazon");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.addFirst("Baidu");
        sites.addLast("Tencent");
        sites.add(0, "ByteDance");
        System.out.println(sites); //有顺序，可重复

        //删除元素
        System.out.println("----------删除元素----------");
        sites.remove("Baidu");
        sites.remove(1);
        sites.removeFirst();
        sites.removeLast();

        //查询元素
        System.out.println("----------查询元素----------");
        sites.get(1);
        sites.getFirst();
        sites.getLast();

        //遍历
        System.out.println("----------1.遍历元素for----------");
        for(int i=0; i< sites.size(); i++){
            System.out.println(sites.get(i));
        }

        System.out.println("----------2.遍历元素foreach----------");
        for (String i: sites){
            System.out.println(i);
        }

        System.out.println("----------3.用迭代器遍历----------");
        Iterator it = sites.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("----------4.用列表迭代器遍历----------");
        ListIterator lit = sites.listIterator();
        while(lit.hasNext()){
            System.out.println(lit.next());
        }
    }
}
