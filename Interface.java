//Inteterface is not a class , it is like a class
// And every method define in a function are public method
//how to instantiated it
// Interface will tell you the what are the methods to run , but I will not run for you
// I will give you the instrction to do something but you have to do it
// I will not do it for you
// In terms of class we used extend keyword
// In case of interface we use implements
//static keyword method does need a method to be called out, it can be directly called
//interface does not have its own memory
interface Dance
{
    //All the variable inside the interface is by default final and static
    int age=25;
    String area = "Bangalore";
    void show();
    void config();
}
class Music implements Dance
{
    public void show()
    {
        System.out.println("I am defining in show");
    }
    public void config()
    {
        System.out.println("I am defining in config");
    }
}
public class Interfaces {
    public static void main(String[]args)
    {
        Dance obj=new Music();
        obj.show();
        obj.config();

        System.out.println(Dance.area);
        System.out.println(Dance.age);

    }
}
