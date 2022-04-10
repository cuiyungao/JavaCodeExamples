package thread;

import java.util.TreeMap;

public class DeadLockExample2 implements Runnable{
    public int flag = 1;
    static Object o1= new Object(), o2 = new Object();

    public void run(){
        System.out.println("flag=" + flag);

        if(flag==1){
            synchronized (o1){
                try{
                    Thread.sleep(500);
                }catch (Exception e){
                    e.printStackTrace();
                }

                //只要锁住o2就完成执行
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName() + "----完成");
                }
            }
        }

        if(flag==0){
            synchronized (o2){
                try{
                    Thread.sleep(500);
                }catch (Exception e){
                    e.printStackTrace();
                }

                //只要锁住o1就完成执行
                synchronized (o1){
                    System.out.println(Thread.currentThread().getName() + "----完成");
                }
            }
        }
    }

    public static void main(String[] args) {
        DeadLockExample2 dl1 = new DeadLockExample2();
        DeadLockExample2 dl2 = new DeadLockExample2();
        dl1.flag = 1;
        dl2.flag = 0;
        //开启两个线程
        Thread t1 = new Thread(dl1);
        Thread t2 = new Thread(dl2);
        t1.start();
        t2.start();
    }
}


