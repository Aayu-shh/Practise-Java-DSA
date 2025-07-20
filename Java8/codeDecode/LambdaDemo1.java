package Java8.codeDecode;

import java.util.function.BiConsumer;

public class LambdaDemo1 {
    public static void main(String[] args) {
    add(2,4);

    //Java 8 way using Biconsumer
        BiConsumer<Integer,Integer> biConsumer = (a,b)-> System.out.println(a+b);
        biConsumer.accept(2,4);

        BiConsumer<Integer,Integer> biConsumer1= (Integer a,Integer b)->System.out.println(a+b);

        /* Implementing using Anonymous classes Java 1.1 */
        functionalInterfaceDemo funcIntDemo = new functionalInterfaceDemo() {
            @Override
            public void singleAbstraceMethod() {
                System.out.println("Implemented Functional Interface using Anonymous classes ");
            }
        };
        funcIntDemo.singleAbstraceMethod();

        /* Using JAVA 8 Lamdas */
        functionalInterfaceDemo funcIntDemoLamda = ()-> System.out.println("Implemented Functional Interface using Lambda");
        funcIntDemoLamda.singleAbstraceMethod();
    }

    public static void add(int a,int b){
        System.out.println(a+b);
    }

}
