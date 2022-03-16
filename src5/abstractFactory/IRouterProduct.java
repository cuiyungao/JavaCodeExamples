package abstractFactory;

//路由器产品接口
public interface IRouterProduct {
    //开机
    void start();

    //关机
    void shutdown();

    //打开WIFI
    void openwifi();

    //设置
    void setting();

}
