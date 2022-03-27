package iteratorTest;
import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(12);
//        numbers.add(8);
//        numbers.add(24);
//
//
//        Iterator it = numbers.iterator();
//        while(it.hasNext()){
//            Integer i = (Integer) it.next(); //强制类型转换
//            if (i < 10){
//                it.remove();
//            }
//        }
//        System.out.println(numbers);

        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add(1);
        aggregate.add(2);
        aggregate.add(3);
        aggregate.add(4);

        Iterator iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
