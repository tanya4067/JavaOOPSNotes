import java.io.IOException;

class Vehicle {
    String brand;
    public Vehicle(String brand)
    {
        this.brand=brand;
    }
    public void honk()
    {
        System.out.println("Vehicle Sound!");
    }
    public void displaayBrand() {
        System.out.println("Brand " + brand);
    }
}
class Car extends Vehicle {
    String model;

    public Car(String brand,String model)
    {
        super(brand); //Calls the parent class constructor, super keyword is used to call the parent
        this.model=model;
    }
    @Override
    public void honk()
    {
        System.out.println("Car honk ! Beep Beep");
    }
    public void displayCarDetails()
    {
        displaayBrand();
        System.out.println("Model "+model);
    }
    public static void main(String[]args)throws IOException
    {
        Car myCar=new Car("I20","Top Model");
        myCar.displayCarDetails();
        myCar.honk();

        Vehicle vehicle=new Vehicle("Generic Motors");
        vehicle.honk();
    }
}
