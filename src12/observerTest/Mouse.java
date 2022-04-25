package src12.observerTest;

public class Mouse implements MyObserver{
    @Override
    public void response() {
        System.out.println("老鼠努力逃跑！");
    }
}
