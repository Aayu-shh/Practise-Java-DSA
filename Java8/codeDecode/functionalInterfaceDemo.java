package Java8.codeDecode;

@FunctionalInterface
public interface functionalInterfaceDemo {
     abstract void singleAbstraceMethod();

    static void staticMethod1(){
        System.out.println("Inside staticeMethod1");
    }
    static void staticMethod2(){
        System.out.println("Inside staticMethod2");
    }
    default void defaultMethod1(){
        System.out.println("Inside defaultMethod1");
    }
    default void defaultMethod2(){
        System.out.println("Inside defaultMethod2");
    }
//    void abstract secondAbstraceMethodNotALLOWED();
}


