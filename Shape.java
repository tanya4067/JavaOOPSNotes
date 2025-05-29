import java.io.IOException;

abstract class Shape
{
    String color;
    public abstract double calculateArea();//Function is declared but not use , that is abstract class
    public void setColor(String color)
    {
        this.color=color;
    }
    public String getColor()
    {
        return (color);
    }
}
class Circle extends Shape
{
    double radius;
    public Circle(String color,double radius)
    {
        this.color=color;
        this.radius=radius;
    }
    @Override
    public double calculateArea()
    {
        return(Math.PI * radius *radius);
    }
    public static void main(String [] args)throws IOException
    {
//        Shape shape=new Shape();
        // Cannot instaitiate an abstract class directly as it may create some error
        Circle circle=new Circle("Red",5);
        System.out.println("Color of the circle "+circle.color);
        System.out.println("Area for the cirlce "+circle.calculateArea());

        Circle circle1=new Circle("Blue", 10);

        System.out.println("Color of the circle "+circle1.color);
        System.out.println("Area for the cirlce "+circle1.calculateArea());


    }
}
