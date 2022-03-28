package iteratorTest;

//Iterator迭代器接口类
public interface Iterator {
    //两个重要的方法
    //得到下一个对象
    Object next();

    //判断是否有下一个对象
    boolean hasNext();
}
