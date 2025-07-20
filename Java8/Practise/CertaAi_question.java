package Java8.Practise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CertaAi_question {
    public static void main(String[] args) {
        System.out.println(getWordWithMostRepeatedChars("Hi I am Aaayush"));
    }

    //Find word which has most repeated characters
    /*
    Steps:
    1 Break the Sentence into LIST of WORDS
    2 Break the words into Characters
    3 Find Most repeated character's number of Duplicates for each word
    4 Find WORD with greatest number of repeated chars
     */
    private static String getWordWithMostRepeatedChars(String sentence){
        //Using Core Java Loops and HashMap
//        String[] wordArray = sentence.split(" ");
//        Map<String,Long> maxNumOfRepeatedCharMap = new HashMap<>();
//        for(String word: wordArray){
//            String [] charArray = word.split("");
//            Map<String,Long> myCharCountMap = Arrays.stream(charArray).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
//            Long max = myCharCountMap.values().stream().max(Long::compareTo).orElse(-1L);
//            maxNumOfRepeatedCharMap.put(word,max);
//        }
//        Optional<Map.Entry<String,Long>> myOp = maxNumOfRepeatedCharMap.entrySet().stream().max((e1,e2)->e2.getValue().compareTo(e1.getValue()));
//        return myOp.orElse(null).getKey();
//
        String[] wordArray = sentence.split(" ");
        Map<String,Integer> maxCharDuplicatesInWord = new HashMap<>();
        for(String word:wordArray){
            Map<Character,Integer> charCountMap = new LinkedHashMap<>();
            //To Form Character counts in each word
            for(Character ch : word.toCharArray()){
                charCountMap.put(ch,charCountMap.getOrDefault(ch,0)+1);
            }
            Integer mostDuplicatedCharInWord = -1;
            for(Map.Entry entry:charCountMap.entrySet()){
                if((int)(entry.getValue())>mostDuplicatedCharInWord) mostDuplicatedCharInWord=(int)entry.getValue();
            }
            maxCharDuplicatesInWord.put(word,mostDuplicatedCharInWord);
        }
        int max = -1;
        String word = "";
        for(Map.Entry myEntry:maxCharDuplicatesInWord.entrySet()){
            if(max < (int) myEntry.getValue())
            {
                max=(int)myEntry.getValue();
                word=(String)myEntry.getKey();
            }
        }
        return word;
    }

}
