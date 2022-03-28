package collection;
import java.util.*;

public class HashmapTest {
    public static void main(String[] args) {
        HashMap<Integer,String> sites = new HashMap<>(); //需指定key和value的类型
        //添加键值对
        sites.put(1, "Google");
        sites.put(2, "Amazon");
        sites.put(3, "Taobao");
        sites.put(4, "Zhihu");
        sites.put(4, "Yahoo"); //替换掉已有键的值
        System.out.println(sites);

        //查找键值对
        System.out.println(sites.get(3));

        //删除键值对
        sites.remove("Yahoo");
//        sites.clear();

        //遍历键值对
        System.out.println("----------1. keySet()+增强for----------");
        Set<Integer> keyset = sites.keySet();
        for (Integer key: keyset){
            System.out.println(sites.get(key));
        }

        System.out.println("----------2. 另一种形式----------");
        for(Integer key: sites.keySet()){
            System.out.println("key: " + key + " value: " + sites.get(key));
        }

        System.out.println("----------3. values()+增强for----------");
        for(String value: sites.values()){
            System.out.println(value);
        }
    }
}

