class Tanya
{
    public void show()
    {
        System.out.println("In show Tanya");
    }
    public void config()
    {
        System.out.println("I am in config");
    }
}
class Sahyog extends Tanya
{
    public void show()
    {
        System.out.println("In show Sahyog");
    }
    public void config()
    {
        System.out.println("Sahyog System");
    }
}
//Override the method of the parent class
//Method Overrirde os for different class function having same name ,
// same type and same parameter
public class methodOverriding {
    public static void main(String[]args)
    {
        Sahyog obj=new Sahyog();
        obj.show();
        obj.config();
    }
}
