package iteratorPattern;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        ConcreteAggregate ca=new ConcreteAggregate();
        Iterator iteratorTest=ca.CreateIterator();
        for(iteratorTest.First(); !iteratorTest.isDone();iteratorTest.Next()){//前面的First是为了将迭代器初始化
            System.out.println(iteratorTest.CurrentItem());
        }
    }
}
//a
//b
//c
//d
//e