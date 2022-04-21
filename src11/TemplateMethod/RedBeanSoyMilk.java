package src11.TemplateMethod;

public class RedBeanSoyMilk extends SoyMilk {

    @Override
    void addCondiments() {
        System.out.println("第二步：加入上好的红豆 ");
    }

}