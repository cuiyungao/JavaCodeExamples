package abstractFactory;

public class XiaomiRounter implements IRouterProduct{
    @Override
    public void start() {
        System.out.println("XiaomiRouter start...");
    }

    @Override
    public void shutdown() {
        System.out.println("XiaomiRouter shutdown...over");
    }

    @Override
    public void openwifi() {
        System.out.println("Xiaomi WIFI is opened");
    }

    @Override
    public void setting() {
        System.out.println("Xiaomi Router service for you");
    }
}
