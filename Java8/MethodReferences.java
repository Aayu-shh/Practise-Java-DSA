package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/*
* !in Java8 we use methods as Objects and pass them to Arguments of other methods
* - A lambda Expression calling Existing method like Math.sum()
*  - Java8 Method References give Short hand way of writing this call
*  - generic syntax : Object :: methodName
 * */

public class MethodReferences {
    public static void main(String[] args) {
        Function<Integer,Integer> getSquare = i -> i * i;
//        System.out.println(getSquare.apply(5));

        //Passing Lambda Function as Argument
//        someOtherFunction(3,getSquare);

        //Method References
        //Prints all elements of a list , calls ONLY one ,method in its entire execution
        List list = Arrays.asList("Aayush","Ram","Shyam");
        System.out.println("From forEach() OLD way");
        list.forEach(s -> System.out.println(s));

        //Shorthand way
        System.out.println("From forEach() NEW way");
        list.forEach(System.out::println);
    }
    private static void someOtherFunction(int a, Function<Integer, Integer> operation){
        System.out.println(operation.apply(a));
    }
}
