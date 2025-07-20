package Java8.Practise;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {
        String str1 = "Aayush";
        Map<Character,Long> myCharFrequencyMap = str1.toLowerCase().chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        myCharFrequencyMap.forEach((key, value) -> System.out.println(key + " : " + value));

        //Finding first unique character
        Optional<Map.Entry<Character, Long>> myFirstUniqueCharacter = myCharFrequencyMap.entrySet().stream().filter(myEntry -> myEntry.getValue()==1).findFirst();
        System.out.println(myFirstUniqueCharacter.map(Map.Entry::getKey).orElse(null));
        //Finding First Duplicate
        Character firstDuplicateChar = myCharFrequencyMap.entrySet().stream().filter(myEntry->myEntry.getValue()>1).findFirst().map(Map.Entry::getKey).orElse(null);
        List<Map.Entry<Character, Long>> duplicateCharList = myCharFrequencyMap.entrySet().stream().filter(myEntry->myEntry.getValue()>1).toList();
        System.out.println(duplicateCharList);

        //Duplicates in a list of integers
        List<Integer> myList = Arrays.asList(1,2,3,5,6,1,2,5);
        System.out.println(
                myList.stream()
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                        .entrySet().stream()
                        .filter(myEntry -> myEntry.getValue() == 1)
                        .map(Map.Entry::getKey)
                        .findFirst()
                        .orElse(null));
    }
}
