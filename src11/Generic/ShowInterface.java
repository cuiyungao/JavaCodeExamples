package src11.Generic;

public interface ShowInterface<T> {
    public void show(T t);
}

//实现类已确定类型
class ShowClass1 implements ShowInterface<String>{
    public void show(String t){
        System.out.println("show:"+t);
    }
}

//实现类未确定类型
class ShowClass2<T> implements ShowInterface<T>{
    public void show(T t){
        System.out.println("show:"+t);
    }
}