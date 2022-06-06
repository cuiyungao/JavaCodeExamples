package src12.observerTest;

public class Dog implements MyObserver{
    @Override
    public void response() {
        System.out.println("狗跟着叫！");
    }
}
