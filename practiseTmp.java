import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class practiseTmp {
    public static void main(String[] args) {
        //Strings
        /*
        1. String pool (a special area inside the heap memory).
        2. A new String obj always created in "Heap" |  same content, but diff reference -> new String("String Text")
        3. intern() checks if a string with the same content exists in the pool. YES -> Returns the reference
         */

        /* String Constant Pool (also called String Intern Pool). */
        String s1 = "Aayush"; //  first used, it is placed in String pool.
        String s2 = "Aayush"; //used again, Java reuses the same reference
        String s3 = new String("Aayush");
        //Any Other Way to create string?

        String s4 = "Aayush";
        String s5 = new String("Aayush").intern();

//        System.out.println("s1 s2- "+ (s1==s2));
//        System.out.println("s1 s2- "+s1.equals(s2));
//        System.out.println("s1 s3- "+(s1==s3));
//        System.out.println("s1 s3- "+s1.equals(s3));
//        System.out.println("s1 s4- "+(s1==s4));
//        System.out.println("s1 s5- "+(s1==s5));

        String str1 = "Aayush";
        Map<Character,Long> myCharFrequencyMap = str1.toLowerCase().chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        //Finding first unique character
        myCharFrequencyMap.entrySet().forEach(entry -> System.out.println(entry.getKey()+" : "+entry.getValue()));
        Optional<Map.Entry<Character, Long>> myFirstUniqueCharacter = myCharFrequencyMap.entrySet().stream().filter(myEntry -> myEntry.getValue()==1).findFirst();
        System.out.println(myFirstUniqueCharacter.map(Map.Entry::getKey).orElse(null));
    }
}
