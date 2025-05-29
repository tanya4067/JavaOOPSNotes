import java.io.IOException;

class Counter
{
    private int count;
    public synchronized void increment()
    {
        count++;
        System.out.println(Thread.currentThread().getName()+" incremented to: "+count);
    }
    public int getCount()
    {
        return count;
    }
}
class CounterThread extends Thread
{
    private Counter counter;
    public CounterThread(Counter counter)
    {
        this.counter=counter;
    }
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            counter.increment(); // increment() method is synchronized
            // This ensures that even if t1 and t2 try to call increment() simultaneously , only one thread will execute it at  time
            // preventing race conditions on the count variable .
            try
            {
                Thread.sleep(20);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class Synchronized {
    public static void main(String[]args) throws IOException, InterruptedException {
        Counter counter=new Counter();
        CounterThread t1=new CounterThread(counter);
        CounterThread t2=new CounterThread(counter);

        t1.start();
        t2.start();

        t1.join(); // Wait for t1 to finish
        t2.join(); // Wait for t2 to finish

        System.out.println("Final Count "+counter.getCount());
    }
}
