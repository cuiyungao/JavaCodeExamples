package iteratorTest;
import java.util.*;

//ConcreteIterator具体迭代器类，实现Iterator
public class ConcreteIterator implements Iterator {
    private List list;
    private int currentIndex = 0;

    public ConcreteIterator(List list) {
        this.list = list;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return list.get(currentIndex++);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        if (currentIndex == list.size()) {
            return false;
        }
        return true;
    }

}
