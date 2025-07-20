package Java8;
import java.lang.*;
import java.util.function.Predicate;

public class Lambda {

    @FunctionalInterface
    interface testInterface{
        int operation(int a,int b);
    }
    public static void main(String [] agrs){
        //Lamda expression to Add 2 numbers
        testInterface add = (int num1,int num2)->num1+num2;
        //Lambda expression to return product of 2 numbers
        testInterface multiply = (int num1, int num2)->num1*num2;
        System.out.println("My First addition Lambda: "+add.operation(2,5));
        System.out.println("My First multiplication Lambda: "+multiply.operation(2,5));

        Predicate<Integer> pr1 = (Integer a) -> a>5;
        System.out.println(pr1.test(54));

        /*
        * Lambdas can have
        *  -> 0 Parameters
        *  -> 1 Parameters
        *  -> Many Parameters
        *
        *  --> Functional Programming
        *  --> Cleaner and efficient code
        *  -->Pass code (Block of code) as data
        * --> They are instances Functional Interfaces ==> Concise way of writing implementation of single method interfaces
        * --> Class independence => Can create methods without creating class objects
        * --> Pass and Execute ==> Pass lambda expressions as objects and Run when needed
        *
        * */
    }
}
