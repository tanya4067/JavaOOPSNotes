class Laptop
{
    public void show()
    {
        System.out.println("This is a Laptop");
    }
}
class Computer extends Laptop
{
    public void show()
    {
        System.out.println("This is Computer");
    }
}
class Tablet extends Laptop
{
    public void show()
    {
        System.out.println("This is Tablet");
    }
}
//It simple implies that one object can behave differntly at multiple positions
//This is called as runtime polymorphism
// The refernce of each variable can be changed everytime
public class dynamicMethodDispatcher {
   public static void main(String[] args)
   {
       Laptop laptop=new Laptop();
       Computer computer=new Computer();
       Tablet tablet=new Tablet();

       //This is also true
       //Laptop obj1=new Computer();
       //obj1.show();
       //It will display what we are refrencing at

       Laptop ref;
       ref=laptop;
       ref.show();

       ref=computer;
       ref.show();

       ref=tablet;
       ref.show();
   }
}
