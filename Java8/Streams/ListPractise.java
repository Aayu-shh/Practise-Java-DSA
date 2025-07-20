package Java8.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListPractise {
    public static void main(String[] args) {
        //Q1. List of Strings > find Map of String against length of string eg "Aayush":7
        List<String> stringList = Arrays.asList("Aayush","Lakshmi","Aashu","Suma","Ashu");
        System.out.println(stringList.stream().collect(Collectors.toMap(Function.identity(),String::length)));

        //Q2 Grouping equal length Strings
        System.out.println(stringList.stream().collect(Collectors.groupingBy(String::length)));

        //Q3 Sort Names based on their lexicographically order
        System.out.println(stringList.stream().sorted(String::compareTo).toList());

        //Q4 Sort Names based on their length AND lexicographically
        System.out.println(stringList.stream().sorted(Comparator.comparingInt(String::length).thenComparing(String::compareTo)).toList());

        //Q4 Create a 1D list from a 2D list
        List<List<String>> nestedList = Arrays.asList(Arrays.asList("D","B"),Arrays.asList("C","B"),Arrays.asList("A","B"));
        System.out.println(nestedList.stream().flatMap(List::stream).toList());
        //Q4.A. 1D List with Unique Elements only
        System.out.println(nestedList.stream().flatMap(List::stream).collect(Collectors.toSet()));
    }
}

