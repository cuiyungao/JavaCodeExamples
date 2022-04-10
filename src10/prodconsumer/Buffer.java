package prodconsumer;

import java.util.ArrayList;
import java.util.List;

public class Buffer {
    private List<Integer> data = new ArrayList<>();
    private static final int MAX = 2;
    private static final int MIN = 0;

    public void put(int value){
        while (true){
            try {
                //sleep不能放在同步代码块里面，因为sleep不会释放锁，
                // 当前线程会一直占有produce线程，直到达到容量，调用wait()方法主动释放锁
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this){
                //当容器满的时候，producer处于等待状态
                while (data.size() == MAX){
                    System.out.println("buffer is full,waiting ....");
                    try {
                        wait(); //producer处于等待状态
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //没有满，则继续produce
                System.out.println("producer--"+ Thread.currentThread().getName()+"--put:" + value);
                data.add(value);
                //唤醒其他所有处于wait()的线程，包括消费者和生产者
                notifyAll();
            }
        }
    }

    public Integer take(){
        Integer val = 0;
        while (true){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this){
                //如果容器中没有数据，consumer处于等待状态
                while (data.size() == MIN){
                    System.out.println("buffer is empty,waiting ...");
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //如果有数据，继续consume
                val = data.remove(0) ;
                System.out.println("consumer--"+ Thread.currentThread().getName()+"--take:" + val);

                //唤醒其他所有处于wait()的线程，包括消费者和生产者
                //notify必须放在同步代码块里面
                notifyAll();
            }
        }


    }

}
