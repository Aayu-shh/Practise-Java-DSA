package OOP;

public class Polymorphism {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.speak(); // Outputs: Bark
    }
}
class Printer {
    void print(String s) {
        System.out.println(s);
    }

    //Overloading by Changing Parameter Data Type
    void print(int i) {
        System.out.println(i);
    }
}
