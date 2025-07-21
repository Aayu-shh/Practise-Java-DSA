package InterviewQuestionDump;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Delloite {
    {
//        List<Integer> myIntegers = Arrays.asList(2,3,7,1,5);
//        System.out.println(myIntegers.stream().filter(i->i%2==0).toList());
//        myIntegers.stream().sorted(Integer::compareTo).toList();

//        List<String> myStringList = Arrays.asList("abc","bcd","efgk","hij");
//        System.out.println(myStringList.stream().map(str->{
//            Map<String,Integer> myMap = new HashMap<>();
//            myMap.put(str,str.length());
//            return myMap;
//        }).toList());

        List<String> myStringList = Arrays.asList("abc","bcd","efgk","hij");

        //!. Map with Length of String and String
        System.out.println(myStringList.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println(myStringList.stream().collect(Collectors.toMap(Function.identity(),String::length)));


        Integer a = 10,b=10;    //Integer Pooling/Caching -128 to 127
        Integer c=127,d=127; //Integer Pooling/Caching -128 to 127
        Integer e=128, f =128; // NO Integer Pooling/Caching -128 to 127
        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println(e==f); // NO Integer Pooling/Caching -128 to 127
        System.out.println(a.equals(b));
        System.out.println(c.equals(d));
        System.out.println(e.equals(f));
    }
}
