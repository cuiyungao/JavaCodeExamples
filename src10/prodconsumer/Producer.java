package prodconsumer;
import java.util.Random;

public class Producer implements Runnable{
    private Buffer buffer;
    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        buffer.put(new Random().nextInt(10));
    }
}