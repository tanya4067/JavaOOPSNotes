//Unchecked Exception
public class ArthimeticException {
    public static void main(String[]args)
    {
        int numerator=10;
        int denominator=5;
        try
        {
            double result=numerator/denominator;
            System.out.println("Result"+result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error by divinding by zero");
            System.out.println("Exception message"+e.getMessage());
        }
        finally {
            System.out.println("This block is always executed");
        }
    }
}
