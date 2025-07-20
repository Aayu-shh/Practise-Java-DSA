package Java8;
import java.lang.*;

/**
 * Functional interfaces were introduced in JAVA 8
 *  ==> Also called, Single Abstract Method Interfaces
 *  ==> @FunctionalInterface annotation
 *  ==> ONLY One Abstract method definition, don't need "abstract" keyword
 *   ==> Main use case:-> Lambda Expressions (Also known as 'Instance of Functional Interfaces')
 *   ==> When Annotation is used (optional) and More than one Abstract methods are tried to be defined --> Unexpected @FunctionalInterface annotation’ message
 *  */
public class FunctionalInterfaces {

    @FunctionalInterface
    interface FuncInterface1{
        //Functional interfaces can have ONLY one Abstract method
        void abstractFunc(int x);

        //Functional interfaces can have MANY static and default methods
        default void normalFun(){
            System.out.println("Hello Fun!");
        }

        default void abnormalFun(){
            System.out.println("Hello abnormalFun!");
        }

        static void staticMethod1(){
            System.out.println("Hello I am staticMethod1");
        }
        static void staticMethod2(){
            System.out.println("Hello I am staticMethod2");
        }
         static void staticMethod3(){
            System.out.println("Hello I am staticMethod3");
        }
    }
    public static void main(String [] args){
        //Post Java8 implementation
        FuncInterface1 funcObj = (int x)->System.out.println("Hello after Java8: "+2*x);

        //Pre Java8 Interface Implementation(Anyonymous Classes) :
        var funcObj0 = new FuncInterface1() {
//            @Override
            public void abstractFunc(int x) {
                System.out.println("Hello from abstract fun, here's a Gift: "+ 2*x);
            }

        };
        funcObj0.abstractFunc(2);
        funcObj.abstractFunc(2);
        funcObj.normalFun();
        funcObj.abnormalFun();
        FuncInterface1.staticMethod1();
    }
}
