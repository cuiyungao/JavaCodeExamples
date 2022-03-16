package abstractFactory;

//手机产品接口
public interface IPhoneProduct {
    //开始
    void start();

    //关机
    void shutdown();

    //打电话
    void callup();

    //发邮件
    void sendSMS();
}
