package src11.TemplateMethod;

public class Client {

    public static void main(String[] args) {
        System.out.println("----制作红豆豆浆----");
        SoyMilk RedBeanSoyMilk = new RedBeanSoyMilk();
        RedBeanSoyMilk.make();

        System.out.println("----制作纯豆浆----");
        SoyMilk PureSoyMilk = new PureSoyMilk();
        PureSoyMilk.make();
    }

}