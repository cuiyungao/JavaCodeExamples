package src11.TemplateMethod;

public abstract class SoyMilk {

    //模板方法, make, 模板方法可以做成final , 不让子类去覆盖.
    final void make() {
        select();
        /*我们加入了一个条件语句，而该条件是否成立，
        是有一个具体的方法决定的（customerWantCondiments(),
        如果是需要加料的豆浆，才调用addCondiments()）*/
        if(customerWantCondiments()) {
            addCondiments();
        }
        soak();//浸泡
        beat();//搅拌

    }

    //选材料
    void select() {
        System.out.println("第一步：选择好的新鲜黄豆");
    }

    //添加不同的配料， 抽象方法, 子类具体实现
    abstract void addCondiments();

    //浸泡
    void soak() {
        System.out.println("第三步：黄豆和配料开始浸泡，需要3小时");
    }

    void beat() {
        System.out.println("第四步：黄豆和配料放到豆浆机去打碎");
    }

    //钩子方法，决定是否需要添加配料
    boolean customerWantCondiments() {
        return true;
    }
}