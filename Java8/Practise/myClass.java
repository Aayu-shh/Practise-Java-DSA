package Java8.Practise;

import java.util.function.BiFunction;
import java.util.function.Function;

public class myClass {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> add = (a,b)->a+b;
        System.out.println(add.apply(1,2));
        Function<String,Boolean> hasA = s->s.contains("A");
        System.out.println(hasA.apply("Aayush"));


    }
}
