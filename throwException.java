import java.io.IOException;
//Checked Exception - exception which occurs during compiled time
public class throwException {
    public static void validateAge(int age)
    {
        if(age<0 || age>120)
        {
            throw new IllegalArgumentException("Age must be in between 0 ans 120 "+age);
        }
        else
        {
            System.out.println("Age "+age+" is valid");
        }
    }
    public static void main(String[]args)throws IOException
            //It specified that an error has occured
    {
        try
        {
            validateAge(25);
            validateAge(-5);
        }
        catch (IllegalArgumentException e)
        {
            System.err.println("Caught Validation error"+e.getMessage());
        }
        System.out.println("End of throw Exception");
    }
}
