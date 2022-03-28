package iteratorPattern;

public class ConcreteAggregate extends Aggregate {
    //参考了菜鸟教程使用内部类进行实现:https://www.runoob.com/design-pattern/iterator-pattern.html
    public String[] arr={"a","b","c","d","e"};//这里用一个普通数组做示范

    @Override
    public Iterator CreateIterator() {
        return new ConcreteIterator();
    }

    public class ConcreteIterator extends Iterator {

        int index=0;

        @Override
        public Object First() {
            index=0;
            return arr[index];
        }

        @Override
        public void Next() {
            index++;
        }

        @Override
        public boolean isDone() {
            if(index>=arr.length){//因为next会取到下一位，所以界限要取前一点
                return true;
            }
            return false;
        }

        @Override
        public Object CurrentItem() {
            return arr[index];
        }
    }
}
