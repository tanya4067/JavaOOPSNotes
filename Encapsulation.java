class Human
{
    //private keyword - it is only accessible to the same class
    //we should be accessible to the data private but specific permission
    // If you want to know my email id , you have to ask for it
    // So you will ask from my brain an via my mouth , writing (METHOD)
    // I will give you the answer
    private int age; //Instance Variable
    private String name;
    public int getAge()
    {
        return(age);
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return(name);
    }
}
public class Encapsulation {
    //Encapsulation - capsule - no one from outside world can use it
    //Data privacy - if someone want data we need to ask
    public static void main(String[]args)
    {
        Human obj1=new Human();
//        obj1.age=11; // we got error as it is private page
//        obj1.name="Tanya";
        obj1.setAge(10);
        obj1.setName("Sahyog");
        System.out.println(obj1.getName()+" "+obj1.getAge());
    }
}
// So what we are doing binding data and method into a sinle unit
// that is encapsulation
