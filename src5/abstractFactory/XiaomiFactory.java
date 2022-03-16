package abstractFactory;

public class XiaomiFactory implements IProductFactory{
    @Override
    public IPhoneProduct phoneProduct() {
        System.out.println("Xiaomi factory produced a Xiaomi mobile phone, Wuhu!");
        return new XiaomiPhone();
    }

    @Override
    public IRouterProduct routerProduct() {
        System.out.println("Xiaomi factory produced a Xiaomi router, good!");
        return new XiaomiRounter();
    }
}
