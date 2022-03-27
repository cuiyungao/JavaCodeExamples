package iteratorTest;

//Aggregate聚集抽象类
public interface Aggregate {
    //添加
    void add(Object object);

    //创建迭代器
    Iterator createIterator();
}
