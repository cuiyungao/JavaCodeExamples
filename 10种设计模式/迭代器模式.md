# 迭代器模式

### 主要内容

属于行为型的设计模式。

重点是将聚合对象的**存储和遍历行为分离**，提供多种<mark style="color:red;">迭代聚合对象中数据的方法</mark>。迭代器方法是GOF23中设计模式中最为常用的方法，便于对各种集合类型遍历。

主要包含**4个参与者**，包含抽象聚集类、具体聚集类、抽象迭代器类（或者接口）和具体迭代器类。

![迭代器模式UML类图](../.gitbook/assets/1648911234\(1\).png)

### 代码例子

**首先实现聚集抽象类：**

```
package iteratorTest;
//Aggregate聚集抽象类
public interface Aggregate {
    //添加    
    void add(Object object);    
    //创建迭代器    
    Iterator createIterator();
}
```

**实现具体聚集类：**

```
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
```

**实现迭代器接口：**

```
package iteratorTest;
//Iterator迭代器接口类
public interface Iterator {    
    //两个重要的方法    
    //得到下一个对象    
    Object next();    
    //判断是否有下一个对象    
    boolean hasNext();
}
```

**实现具体迭代器：**

```
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
```

**最后测试迭代器模式：**

```
package iteratorTest;
import java.util.*;
public class IteratorTest {    
public static void main(String[] args) {
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
```

### 迭代器模式总结

![](../.gitbook/assets/1648911669\(1\).png)
