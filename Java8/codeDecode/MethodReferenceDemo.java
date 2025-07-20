package Java8.codeDecode;

import java.util.function.Consumer;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        functionalInterfaceDemo fLambda = ()-> System.out.println("Using Lambda to implement Functional Interface Demo");
        functionalInterfaceDemo f = Test::testImplementation;
        f.singleAbstraceMethod();
        Consumer<Integer> cf= Test::testImplementationConsumer;
        cf.accept(2);
    }
}

class Test{
    public static void testImplementationConsumer(int x) {
        System.out.println("I am test implementation of your single abstract method: "+x);
    }
    public static void testImplementation() {
        System.out.println("I am test implementation of your single abstract method");
    }
}
