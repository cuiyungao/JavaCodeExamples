package thread;

public class InterruptTest {
    public static void main(String[] args) throws Exception
{
    Runnable runnable = new Runnable()
    {
        public void run()
        {
            while (true)
            {
                if (Thread.currentThread().isInterrupted())
                {
                    System.out.println("线程被中断了");
                    System.out.println("C isInterrupted()=" + Thread.currentThread().isInterrupted());
                    return ;
                }
                else
                {
                    System.out.println("线程没有被中断");
                }
            }
        }
    };
    Thread t = new Thread(runnable);
    t.start();
    Thread.sleep(3000);
    t.interrupt();
    System.out.println("线程中断了，程序到这里了");
}

}
