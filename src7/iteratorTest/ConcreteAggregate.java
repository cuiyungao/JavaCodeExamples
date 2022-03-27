package iteratorTest;
import java.util.*;

//ConcreteAggregate集体聚集类，继承Aggregate
public class ConcreteAggregate implements Aggregate {
    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(items);
    }

    public void add(Object object) {
        items.add(object);
    }
}
