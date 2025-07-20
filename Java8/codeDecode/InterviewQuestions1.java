package Java8.codeDecode;


import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

public class InterviewQuestions1 {
    public static void main(String[] args) {

        /*Q1. Find list of Duplicates in given integer list*/

        List<Integer> intList = Arrays.asList(1, 2, 4, 5, 2, 5, 6, 1, 8, 3, 8);
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> filteredList = intList.stream()
                .peek(i -> countMap.put(i, countMap.getOrDefault(i, 0) + 1)).
                filter(i -> countMap.get(i) > 1)
                .toList();
//        System.out.println(filteredList);

        //Approach2 -> Using Sets
        Set<Integer> set = new HashSet<>();
        List<Integer> filteredList1 = intList.stream()
                .filter(x -> !set.add(x))
                .collect(Collectors.toList());
//        System.out.println(filteredList1);

        /* Q2. Write program to multiple 2 numbers using functional interface*/
        functionalInterface f1 = (a, b) -> a * b;
//        System.out.println(f1.multiply(4, 2));

        /* Q3. Skip v/s limit*/
        List<Integer> filteredList2 = intList.stream().limit(2).toList();
        List<Integer> filteredList3 = intList.stream().skip(2).toList();
//        System.out.println(filteredList2 + "\n" + filteredList3);

        /* Q4. Count the no of occurance of word in the string*/
        /* Format: {subStr1=2,subStr2=1,subStr3=2}*/
        String str = "Welcome to my world my world is amazing welcome";
//        Pattern myPattern = Pattern.compile("[,]");
//        Matcher match = myPattern.matcher(str);

        Set<String> mySet = new HashSet<>();
        List<String> strList = Arrays.stream(str.split(" "))
                .map(String::trim)
                .filter(s -> !mySet.add(s))       //For catching only duplicates
                .toList();
        System.out.println(strList);

        Map<String, Long> m = Arrays.stream(str.toLowerCase().split(" "))
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())); //Function.identity -> for mapping Keys as substrings and Colelctors.counting() to count each key and reduce to value of MAP
        System.out.println(m);

    }
}
@FunctionalInterface
interface functionalInterface {
    int multiply(int a, int b);
}
