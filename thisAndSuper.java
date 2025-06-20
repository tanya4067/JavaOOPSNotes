class Harry
{
    public Harry()
    {
        System.out.println("Coming to harry");
    }
    public Harry(int a)
    {
        System.out.println("Harry "+a);
    }
}
//By default every constructor has a method called as super ()
// We will not be able to see it but it is there by default every constructor
// super - call the constructor of the super class(default)
class Potter extends Harry
{
    public Potter()
    {
        System.out.println("Coming to potter");
    }
    public Potter(int a) //Always we call the deafult constructor
    {
        super(23);
        System.out.println("Coming to potter "+a);
    }
}
//Whenever where extending it will call the constructor of both;
public class thisAndSuper {
    public static void main(String[]args)
    {
        Potter potter=new Potter(8);

    }
}
