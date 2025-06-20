class Goa
{
    String place;
    int trips;
    public String toString()
    {
        return("Enjoying in Goa");
    }
}
//By default whenever object is called inbuild functions are called
//Here toString() is called
public class stringClassHashCode {
    public static void main(String[]args)
    {
        Goa obj=new Goa();
        obj.place="Baga Beach";
        obj.trips=2;
        System.out.println(obj.toString());
    }
}
