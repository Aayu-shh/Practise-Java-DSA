package OOP;
/*
 Inheritance is a mechanism where one class (the subclass) derives from another (the superclass).

 It expresses an “is-a” relationship
 Pros:
 1. Code Reuse  Common behaviors and attributes can be defined in a superclass
 2. Polymorphism dynamic method binding, Superclass refernce can be used to call any subclass method
 3. conceptually intuitive.

 Cons:
 Tight Coupling, SIngle inheritance only, Change in Base Class might break sub classes

“What’s the difference between composition and inheritance?”

    Composition over inheritance when reusing code, unless there's a true IS-A relationship.
    Composition involves constructing a class using references to other classes, effectively saying “has-a”.
    For example, a Plane class might have an Engine object within it, meaning a plane has-an engine.

    Used Heavily in Spring and Design Patterns like Strategy, Decorator , Adapter
 */
public class Inheritance {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.speak();
    }
}

class Animal {
    void speak() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("Bark");
    }
}

// Composition example
class Engine {
    public void start() {
        System.out.println("Engine starting...");
    }
}

class Plane {
    private Engine engine;

    public Plane() {
        this.engine = new Engine();
    }

    public void startPlane() {
        engine.start();
        System.out.println("Plane is running");
    }
}
