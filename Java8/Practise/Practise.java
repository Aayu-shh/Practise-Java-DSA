package Java8.Practise;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Practise {
    public static void main(String[] args) {
        floydsTriangle(4);
List<Integer> nameList = List.of(1,2,3,5);
        Iterator<Integer> it = nameList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            System.out.println(it.hashCode());
        }

        List<Integer> myList = (List.of(1, 2, 3, 3, 3, 4, 4, 1, 2, 5, 6));
        String myStr="HelloWorld";
        System.out.println(Arrays.stream(myStr.split("")).distinct().collect(Collectors.joining()));

        //Practise Predicate FI composition
        Predicate<Integer> mypr = i->i>5;
        Predicate<Integer> mypr1 = i->i%2==0;
        System.out.println(mypr.and(mypr1).test(2));
        InterfaceMine<Integer> add = (num1, num2) -> num1+num2;
        InterfaceMine<String> append = (s1, s2) -> s1+s2;

        System.out.println(add.additionOrAppending(5,4));
        System.out.println(append.additionOrAppending("aayush","safsaf"));
    }

    private static void floydsTriangle(int n){
        int c = 1;
        for(int i=0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }

    @FunctionalInterface
    interface InterfaceMine<T>{
        T additionOrAppending(T num1,T num2);

        default T addMe(T num) {
            return null;
        }

        private static int addMe1(int num){
            return 0;
        }
    }
}
