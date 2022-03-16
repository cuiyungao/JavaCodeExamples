package abstractFactory;

public class HuaweiPhone implements IPhoneProduct{
    @Override
    public void start() {
        System.out.println("HuaweiPhone start...");
    }

    @Override
    public void shutdown() {
        System.out.println("HuaweiPhone shutdown...over");
    }

    @Override
    public void callup() {
        System.out.println("weiweiwei,here is huawei");
    }

    @Override
    public void sendSMS() {
        System.out.println("Huawei message service for you");
    }
}
