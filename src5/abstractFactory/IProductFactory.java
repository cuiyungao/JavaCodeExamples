package abstractFactory;

public interface IProductFactory {
    //生产手机
    IPhoneProduct phoneProduct();

    //生产路由器
    IRouterProduct routerProduct();

    static IProductFactory FactoryCreate(String str){
        IProductFactory ip=null;
        if(str.equals("huawei")){
            ip=new HuaweiFactory();
        }else if(str.equals("xiaomi")){
            ip=new XiaomiFactory();
        }
        return ip;
    }

}
