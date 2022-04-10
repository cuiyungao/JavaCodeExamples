package thread;

public class AddDec {
    public static void main(String[] args) throws Exception {
        AddThread add = new AddThread();
        add.start();
//        add.join(); //要等待add结束之后，后面的才开始执行
        //使用interrupt中断方法
//        Thread.sleep(200);
//        add.interrupt();

        DecThread dect = new DecThread();
        Thread dec = new Thread(dect);
        dec.start();
//        dec.join(); //要等待dec结束之后，后面的才开始执行


        //使用Lambda表达式创建并启动线程
        Runnable r = () -> {System.out.println("Thread: Runnable with Lambda Expression");};
        Thread lamt = new Thread(r);
        lamt.start();
//        lamt.stop();//stop()方法已被废弃

        //设置优先级
        System.out.println("------------设置优先级------------");
        Runnable r1 = () -> {System.out.println("Thread: Low priority");};
        Runnable r2 = () -> {System.out.println("Thread: high priority");};
        Thread tr1 = new Thread(r1);
        Thread tr2 = new Thread(r2);
        tr1.setPriority(1);
        tr2.setPriority(10);
        tr1.start();
        tr2.start();

    }
}

//class Counter {
//    public static int count = 0;
//}

class AddThread extends Thread {
    public void run() {
        if (!Thread.interrupted()) { //中断的方法之一
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
//                Counter.count += 1;
                System.out.println(Thread.currentThread().getName() + "--AddThread-- " + i);
            }
        }
    }
}

class DecThread implements Runnable {
    public void run() {
        for (int i=0; i<10; i++) {
//            Counter.count -= 1;
        System.out.println(Thread.currentThread().getName()+"--DecThread-- "+ i);}
    }
}

