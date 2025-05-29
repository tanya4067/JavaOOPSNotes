import java.io.IOException;

class Animal
{
    public void makeSound() {
        System.out.println("Animal makes Sound");
    }
}
class Cat extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("Cat makes meow meow sound");
    }
}
class Dog extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("Dog makes sound of bark");
    }
}
public class PolymorphismDemo {
    public static void main(String[]args)throws IOException
    {
        Animal animal=new Animal();
        Animal cat=new Cat(); //Polymorphism is used for the class Animal for class Cat
        Animal dog=new Dog(); //Polymorphism is used for the class Animal for class Dog

        animal.makeSound();
        cat.makeSound();
        dog.makeSound();

    }
}
