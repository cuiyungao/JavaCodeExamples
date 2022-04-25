package src12.observerTest;

public class Cat extends MySubject{
    @Override
    public void cry() {
        System.out.println("猫叫！");
        System.out.println("-------");
        //通知observer反馈
        for(Object obs:observers) {
            ((MyObserver) obs).response();
        }
    }
}
