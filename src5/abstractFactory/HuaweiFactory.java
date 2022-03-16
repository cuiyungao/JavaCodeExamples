package abstractFactory;

public class HuaweiFactory implements IProductFactory{
    //因为这里只有两个产品，为了跟ppt的内容尽量匹配,就不再添加过多的产品量
    @Override
    public IPhoneProduct phoneProduct() {
        System.out.println("The Huawei factory produced a Huawei mobile phone,tql!");
        return new HuaweiPhone();
    }

    @Override
    public IRouterProduct routerProduct() {
        System.out.println("Huawei factory produced a Huawei router,666!");
        return new HuaweiRouter();
    }
}
