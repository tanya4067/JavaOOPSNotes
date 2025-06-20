//Unchecked Exception (Runtime Exception) Exception via which we use try and catch block
public class NullPointerException {
    public static void main(String[]args)
    {
        String str=null;
        int[] n={1,2,3};
        try
        {
            System.out.println("Array length: "+n.length);
            System.out.println("Fourth Element: "+n[1]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Exception: "+e.getMessage());
        }
        finally {
            System.out.println("This block is always executed");
        }
    }
}
