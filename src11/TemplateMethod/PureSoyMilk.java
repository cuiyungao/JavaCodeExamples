package src11.TemplateMethod;

public class PureSoyMilk extends SoyMilk{

    @Override
    void addCondiments() {
        //空实现
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }

}