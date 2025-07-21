package Java8.FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MethodReference2 {
    public static int transformAndAdd(List<Integer> l, Function<Integer,Integer> transform){
        int result = 0;
        for(int i:l){
            result+=transform.apply(i);
        }
        return result;
    }
    public static void main(String[] args) {

        //Ways to call transformAndAdd

        List<Integer> Intlist = Arrays.asList(5,6,8,10);
        //1 Using anonymous class declaration for transform interface
        System.out.println(transformAndAdd(Intlist, new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer i) {
                return UtilityClass.doDouble(i);
            }
        }));

        // 2 Lambda
        System.out.println(transformAndAdd(Intlist, (i)-> UtilityClass.doDouble(i)));

        // 3 METHOD REFERENCES***
        System.out.println(transformAndAdd(Intlist, UtilityClass::doDouble));
    }

}
class UtilityClass{
    public static Integer doDouble(Integer a){
        return a*2;
    }
    public static Integer doHalf(Integer a){
        return (int)Math.floor(a/2);
    }
}
