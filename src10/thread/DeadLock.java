package thread;

public class DeadLock {
    public static String bluekey = "Blue Key";
    public static String redkey = "Red Key";
    public static void main(String[] args) {
        PerA la = new PerA();
        new Thread(la).start();
        PerB lb = new PerB();
        new Thread(lb).start();
    }
}
class PerA implements Runnable{
    public void run() {
        try {
            while(true){
                synchronized (DeadLock.bluekey) {
                    System.out.println(" PerA lock blue key");
                    Thread.sleep(3000); // 此处等待是给B能锁住机会
                    synchronized (DeadLock.redkey) {
                        System.out.println(" PerA open door");
                        Thread.sleep(60 * 1000); // 为测试，占用了就不放
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class PerB implements Runnable{
    public void run() {
        try {
            while(true){
                synchronized (DeadLock.redkey) {
                    System.out.println(" PerB lock red key");
                    Thread.sleep(3000); // 此处等待是给A能锁住机会
                    synchronized (DeadLock.bluekey) {
                        System.out.println(" PerB open door");
                        Thread.sleep(60 * 1000); // 为测试，占用了就不放
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}