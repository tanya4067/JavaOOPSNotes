//First we wanted the normal calculator
//So we simply added created it
//For inheritance we don't need a java file but a class file
import java.util.*;
class calc
{
    public int add(int n1,int n2)
    {
        return(n1+n2);
    }
    public int sub(int n1,int n2)
    {
        return(n1-n2);
    }
}
//But now we wanted advanced calculator
// Which has four functionality - add, subtract, multiply, division
class advanceCalc extends calc
{
    public int multi(int n1,int n2)
    {
        return(n1*n2);
    }
    public int div(int n1,int n2)
    {
        return(n1/n2);
    }
}
//MultiLevel Inheritance - as the name suggests , which is having multiple levels
// A extends B extends C
// A ----> B ----> C
class veryAdvanceCalc extends advanceCalc
{
    public double power(int n1,int n2)
    {
        return(Math.pow(n1,n2));
    }

}
public class Inheritance {
    public static void main(String [] args)
    {
        veryAdvanceCalc obj1=new veryAdvanceCalc();
        int add=obj1.add(3,4);
        int sub=obj1.sub(6,4);
        int mul=obj1.multi(7,8);
        int divi=obj1.div(10,5);
        double power=obj1.power(2,3);
        System.out.println(add+" "+sub+" "+mul+" "+divi+" "+power);

    }
}
//Multiple inheritance does not work
