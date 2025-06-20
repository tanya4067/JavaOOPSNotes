public class finallyBlock {
    public static void main(String [] args)
    {
        int numerator=10;
        int denominator=5;

        try {
            int result = numerator / denominator;
            System.out.println("Result " + result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error : Cannot be divided by zero");
        }
        finally
        {
            System.out.println("Execution completed");
        }
    }
}
