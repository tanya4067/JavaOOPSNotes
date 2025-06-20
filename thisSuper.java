//Every class in java extends the object class
// Multiple Level inheritance
//This keyword is used for calling current calling object
// this() function will execute the function for the same class
//Super() executes the consdtructor of the super/parent class
class A1 extends Object //Super class
{
    public A1() //Default constructor
    {   super(); // This keyword means that it will call the the parent class everytime
                //Call the constructor of the super class , the default one
        System.out.println("WE are in A");
    }
    public A1(int n)
    {   super();
        System.out.println("NA "+n);
    }
}
class B1 extends A1 //Base class
{
    public B1() //Default constructor
    {   super();
        System.out.println("we are in B");
    }
    public B1(int n) //Parameterized Constructor
    {   super(20);
        System.out.println("N "+n);
    }
}
public class thisSuper {
    public static void main(String[]args)
    {
        //Whenever we are creating a object it is calling the constructor of the class
        //Instantiating an object
        //Every constructor in java has a method - super(); - by default
        B1 obj1=new B1();
    }

}
