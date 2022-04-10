package thread;

public class SetDaemonDemo extends Thread{
    public SetDaemonDemo(String name){
        super(name);
    }

    @Override
    public void run() {
        while (true){
            System.out.println(getName() + "----运行----");
        }
    }

    public static void main(String[] args) {
        SetDaemonDemo sd = new SetDaemonDemo("Thread 1");
        //设置sd为守护进程，在主程序结束后
        sd.setDaemon(true);

        sd.start();

        //设置主线程运行2s后结束
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
