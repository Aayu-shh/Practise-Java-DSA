package Java8.codeDecode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        arrList.add(22);
        arrList.add(25);
        arrList.add(56);
        arrList.add(15);

        Stream<Integer> filteredStream = arrList.stream().filter(x -> x % 5 == 0);
        filteredStream.forEach(System.out::println);   //to print each filtered element

//        List<Integer> newFilteredList = filteredStream.collect(Collectors.toList());
//        System.out.println(newFilteredList);
//        long streamCount = filteredStream.count();
//        System.out.println(streamCount);
        System.out.println(arrList.stream().count());
//        System.out.println(arrList.stream().collect(Collectors.toList()));

        System.out.println(arrList.stream().min((i1,i2)->i2.compareTo(i1)).get());    //Comparator cane be replaced by methodReference Integer::compareTo
        System.out.println(arrList.stream().max(Comparator.naturalOrder()));
        System.out.println(arrList.stream().sorted(Comparator.reverseOrder()).toList());
    }
}
