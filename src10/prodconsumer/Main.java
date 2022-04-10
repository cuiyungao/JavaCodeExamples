package prodconsumer;

public class Main {
    public static void main(String[] args){
        Buffer buffer = new Buffer();

        Thread producer1 = new Thread(new Producer(buffer));
        Thread producer2 = new Thread(new Producer(buffer));
        Thread producer3 = new Thread(new Producer(buffer));
        producer1.start();
        producer2.start();
        producer3.start();

        Thread consumer1 = new Thread(new Consumer(buffer));
        Thread consumer2 = new Thread(new Consumer(buffer));
        Thread consumer3 = new Thread(new Consumer(buffer));
        consumer1.start();
        consumer2.start();
        consumer3.start();

    }
}