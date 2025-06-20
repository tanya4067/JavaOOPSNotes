class AT
{
    public void show1()
    {
        System.out.println("I wanted to show AT");
    }
}
class BT extends AT
{
    public void show2()
    {
        System.out.println("I wanted to show BT");
    }
}
public class downAndUpCasting {
    public static void main(String[]args)
    {
        AT obj1=(AT) new BT(); //Converting one object to another
        //From parent class to subclass
        //Because we have the refrence of BT , so we dont know that BT even exisit
        //Upcasting;
        obj1.show1();

    }
}
