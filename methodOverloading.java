class Calculator
{//Method overloading is methods with same name , but of different parameter and type
    // Multiple method with same name

    public int add(int n1,int n2)
    {
        return(n1+n2);
    }
}
public class methodOverloading {
    public static void main(String[] args)
    {
        Calculator obj1=new Calculator();
        int result= obj1.add(10,20);
        System.out.println(result);
    }
}
