package thread;


public class RunnableVSThread {
    public static void main(String[] args) throws Exception {
        //Runnable多线程共享一个对象
        TestRunnable tr = new TestRunnable();
        Thread td1= new Thread(tr);
        td1.start();
        Thread.sleep(200);

        Thread td2 = new Thread(tr);
        td2.start();
        Thread.sleep(200);

        Thread td3 = new Thread(tr);
        td3.start();
        Thread.sleep(200);

        //继承Thread则为每个线程创建一个实例对象
        TestThread tt1 = new TestThread();
        tt1.start();
        Thread.sleep(200);

        TestThread tt2 = new TestThread();
        tt2.start();
        Thread.sleep(200);

        TestThread tt3 = new TestThread();
        tt3.start();
        Thread.sleep(200);
    }
}

class TestRunnable implements Runnable {
    private int counter = 3;

    public void run(){
        counter--;
        System.out.println(Thread.currentThread().getName()+"--Runnable--"+counter);
    }
}

class TestThread extends Thread {
    private int counter = 3;

    @Override
    public void run() {
        counter--;
        System.out.println(Thread.currentThread().getName()+"--Thread--"+counter);
    }
}