package src12.observerTest;

import java.util.*;

//抽象目标类
public abstract class MySubject {
    //建立一个观察者的集合
    protected ArrayList observers = new ArrayList();
    //注册方法
    public void attach(MyObserver observer)
    {
        observers.add(observer);
    }
    //注销方法
    public void detach(MyObserver observer)
    {
        observers.remove(observer);
    }
    public abstract void cry(); //抽象通知方法
}
