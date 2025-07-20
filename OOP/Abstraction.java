package OOP;
/*
Two tools in Java for abstraction:
1 abstract class
2 Inheritance

➡️ Used for multiple inheritance of behavior (Java allows multiple interfaces but not multiple classes).
 */
public class Abstraction {
    public static void main(String[] args) {
        Vehicle myVehicle = new Car();
        myVehicle.start();
        myVehicle = new Bike();
        myVehicle.start();
    }
}

abstract class Vehicle{
    abstract void start();
}

class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Car is starting....");
    }
}

class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("Bike is starting....");
    }
}

interface flyable{
    void fly();
    default void glide(){
        System.out.println("Gliding ..");
    }
}

