package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringsAdvanced {
    public static void main(String[] args) {
        nonRepeatingChar("Aayush");
//        System.out.println('b'-'a');
    }

    //Nonrepeating Chars
    private static int nonRepeatingChar(String str){
        //Using Arrays
      List<Boolean> charBoolList = new ArrayList<>(Arrays.asList(new Boolean[26]));
//      Arrays.fill(charBoolList,false);
//        charBoolList=charBoolList.forEach(c->c);
        System.out.println(charBoolList);
        str = str.toLowerCase();
      for(int i=0;i<str.length();i++){
        int asciChar = str.charAt(i)-'a';
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
}
