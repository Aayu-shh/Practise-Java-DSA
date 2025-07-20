package Java8.codeDecode;
import java.util.function.*;
public class PreDefinedFunctionInterfaces {
    public static void main(String [] args){
        String str = "aayush";

        Predicate<String> isEvenLength=s->s.length()%2==0;
        System.out.println(isEvenLength.test(str));
        System.out.println(isEvenLength.test(str+"aaaa"));
        System.out.println(isEvenLength.test(str+"asfasf"));

        //Predicate Joining
        Predicate<String> isSmall = s ->s.length()>5;

        System.out.println("Joining the 2 predicates AND : "+isEvenLength.and(isSmall).test("Hello"));
        System.out.println("Joining the 2 predicates OR : "+isEvenLength.or(isSmall).test("Helloo"));
        System.out.println("Joining the 2 predicates NEGATE: "+isEvenLength.negate().test("Helloo"));

        //Function
        Function<String,String> replicateString = s->s+s;
        System.out.println("String Replicated: "+replicateString.apply(replicateString.apply("Akka")));

        //Function Chaining
        Function<Integer,Integer> doubleIt = n->n*2;
        Function<Integer,Integer> squareIt = n->n*n;
        System.out.println("Chaining using andThen: "+doubleIt.andThen(squareIt).apply(5));
        System.out.println("Chaining using compose: "+doubleIt.compose(squareIt).apply(5));
    }
}

