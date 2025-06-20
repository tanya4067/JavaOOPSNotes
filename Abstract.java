// At this point I dont know how to drive the car
// How to setup the engine
// How to start the car
// But a car shoudl drive , it is essential feature
// We are defining but not adding important feature to it
// Abstract method will only be inside the abstarct class
// We cannot object of a abstract class
abstract class Car1
{

    public abstract void drive(); //decalring a method instead of defeining it
    public void playMusic()
    {
        System.out.println("Play Music");
    }
}
class Wagon extends Car1 //Concrete Class
{
    public void drive() //Override method
    {
        System.out.println("Wagon is Driving");
    }
}
public class AbstractKeyWord {
    public static void main(String[]args)
    {
        Car1 obj=new Wagon();
        obj.drive();
        obj.playMusic();
    }
}
