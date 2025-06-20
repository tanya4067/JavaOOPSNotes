class hi implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("hi");
            try
            {
                Thread.sleep(10);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
class hello implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("hello");
            try
            {
                Thread.sleep(10);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
//Multilevel inheritance in java
public class Multithreading2 {
    public static void main(String[]args)
    {
        Runnable hi=new hi();
        Runnable hello=new hello();

        Thread t1=new Thread(hi);
        Thread t2=new Thread(hello);

        t1.start();
        try
        {
            Thread.sleep(10);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        t2.start();
    }
}
