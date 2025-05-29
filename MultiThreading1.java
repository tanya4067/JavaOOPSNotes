class A extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("hi");
            try {
                Thread.sleep(20);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            //It shows the interrupted Checked Exception
            //Exception happening during runtime of the program is called Exception
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class MultiThreading1 {
    public static void main(String[]args)
    {
        A obj1=new A();
        B obj2=new B();
        //Just because of thread class things are running in parallel
        //We have a concept of scheduler
        obj1.start();
        obj2.start();
    }
}
