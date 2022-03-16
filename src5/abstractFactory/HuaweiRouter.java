package abstractFactory;

public class HuaweiRouter implements IRouterProduct{
    @Override
    public void start() {
        System.out.println("HuaweiRouter start...");
    }

    @Override
    public void shutdown() {
        System.out.println("HuaweiRouter shutdown...over");
    }

    @Override
    public void openwifi() {
        System.out.println("Huawei WIFI is opened");
    }

    @Override
    public void setting() {
        System.out.println("Huawei Router service for you");
    }
}
