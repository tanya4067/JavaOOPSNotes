//wrapper classes provide a way to use primitive data types(int , boolean , etc) as objects
//byte -> Byte
//short ->Short
//int -> Integer
//long -> Long
//float -> Float
//double -> Double
//boolean -> Boolean
//char -> Character
//We use wrapper class in case of Collections

public class wrapperClass
{
    public static void main(String[]args)
    {
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
    }
}

