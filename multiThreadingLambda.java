public class MultithreadingLamba {
    public static void main(String[]args)
    {

        Thread t1=new Thread(()->{
            for(int i=1;i<=5;i++)
            {
                System.out.println("hi");
                try{Thread.sleep(10);}
                catch(Exception e){e.printStackTrace();}
            }

        });
        Thread t2=new Thread(()->{
            for(int i=1;i<=5;i++)
            {
                System.out.println("hello");
                try{Thread.sleep(10);}
                catch(Exception e){e.printStackTrace();}
            }

        });
        t1.start();
        t2.start();
    }
}
