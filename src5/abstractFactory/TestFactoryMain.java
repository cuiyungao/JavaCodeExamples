package abstractFactory;

public class TestFactoryMain {
    public static void main(String[] args) {
        //抽象工厂模式与工厂模式区别:https://blog.csdn.net/gwz_6903/article/details/80494262(推荐博文)
        //最大的不同在于可以拥有多个抽象产品类
        IProductFactory huaweiFactory=IProductFactory.FactoryCreate("huawei");
        IProductFactory xiaomiFactory=IProductFactory.FactoryCreate("xiaomi");

        IPhoneProduct huaweiPhone=huaweiFactory.phoneProduct();
        huaweiPhone.start();
        huaweiPhone.callup();
        huaweiPhone.shutdown();

        IRouterProduct xiaomiRouter=xiaomiFactory.routerProduct();
        xiaomiRouter.openwifi();
        xiaomiRouter.setting();
    }
    //运行结果
    //The Huawei factory produced a Huawei mobile phone,tql!
    //HuaweiPhone start...
    //weiweiwei,here is huawei
    //HuaweiPhone shutdown...over
    //Xiaomi factory produced a Xiaomi router, good!
    //Xiaomi WIFI is opened
    //Xiaomi Router service for you
}
