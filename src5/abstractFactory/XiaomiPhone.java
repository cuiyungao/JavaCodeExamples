package abstractFactory;

public class XiaomiPhone implements IPhoneProduct{

    @Override
    public void start() {
        System.out.println("xiaomiPhone start...");
    }

    @Override
    public void shutdown() {
        System.out.println("xiaomiPhone shutdown...over");
    }

    @Override
    public void callup() {
        System.out.println("mimimi,this is xiaomi");
    }

    @Override
    public void sendSMS() {
        System.out.println("Xiaomi message service for you");
    }
}
