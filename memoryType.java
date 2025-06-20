//Inside JVM there are two types of memory
//        Stack (LIFO)
//        Heap (Expandable Area)
//Every method will have its own stack memory
//Stack will have a key and value
// Local Variable comes in stack while instance variable in heap memory
// name and address are saved in stack memory
//Actual implementation start from the Stack only.
//Object is created in heap memory -
    //It also have its own address 101
    //It will have two section - all the variable(Instance) and
    // second will have method defination all the object
// We go from stack to heap
class CalculatorAdd
{ int num; //Instance variable
    public int add(int n1,int n2)
    {
        return(n1+n2);//local variable
    }
}
public class memoryTypes {
    public static void main(String[]args)
    {
        int data=10;
        CalculatorAdd obj1=new CalculatorAdd();
        int result=obj1.add(10,20);
        System.out.println(result);

    }
}
