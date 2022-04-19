package src11.Generic;

public class Durian<T> {
    // 使用T类型形参定义实例属性
    private T info;

    // 下面方法中使用T类型形参来定义构造函数
    public Durian(T info) {	 this.info = info; }
    public void setInfo(T info) { this.info = info;}
    public T getInfo() {	return this.info;}

    // 静态泛型方法应该使用其他类型区分:里面的<>一定要紧跟静态声明
    public static <K> Durian<K>readyear(K info) {
        return new Durian<K>(info);
    }

//    public static <T> Durian<T> readyear(T info) {
//        return new Durian<T>(info);
//    }
}
