package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringsAdvanced {
    public static void main(String[] args) {
        nonRepeatingChar("Aayush");
        //System.out.println('b'-'a');

        //Q. Reverse a Sentence word by word without using inbuilt methods
        String mySentence = "Today is Saturday";

        //Method1: Using loop
        reverseStr(mySentence);
        //Method2: Using recursion
        reversedByRecursion(mySentence.split(" "),mySentence.split(" ").length-1);

        // -- With method
        // Method 1: Java 8
        System.out.println(
                String.join(" ", Arrays.stream(mySentence.split(" ")).toList()
                        .reversed()));
        // Method 2: Java 8
        System.out.println(
                String.join(" ",Arrays.asList(mySentence.split(" "))
                        .reversed()));
    }

    //Nonrepeating Chars
    private static int nonRepeatingChar(String str){
        //Using Arrays
      List<Boolean> charBoolList = new ArrayList<>(Arrays.asList(new Boolean[26]));
        str = str.toLowerCase();
      for(int i=0;i<str.length();i++){
        int asciChar = str.charAt(i)-'a';
        // Checking if the boolean position is filled already
        if(charBoolList.get(asciChar))
            charBoolList.set(asciChar,true);
        else
            charBoolList.set(asciChar,false);
      }
      int smallestCharAsci = Integer.MAX_VALUE;
      for(int i =0;i<charBoolList.size();i++) {
          if (charBoolList.get(i)) {
              smallestCharAsci = Math.min(smallestCharAsci, i);
          }
      }
      return str.indexOf((char)('a'+smallestCharAsci));
    }

    private static String reverseStr(String str){
        String[] myWordList = str.split(" ");
        String newStr ="";
        for(int i=myWordList.length-1;i>=0;i--){
            newStr+=myWordList[i];
            if(i!=0){
                newStr+=" ";
            }
        }
        System.out.println(newStr);
        return null;
    }

    private static void reversedByRecursion(String [] strArr,int index){
        if(index<0){
            return;
        }
        System.out.print(strArr[index]+" ");
        reversedByRecursion(strArr,index-1);
    }
}
