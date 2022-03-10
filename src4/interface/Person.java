public interface Person {

//    这里所有的字段都是public final static
    int totalNumber=100;//如果不初始化是会报错的

//    这里所有的方法都是public abstract
//    任何实现这个接口的类都必须重写这两个方法
    void getDuty();
    void getMission();
}
