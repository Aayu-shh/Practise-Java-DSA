package Strings;

import java.util.*;

public class String101 {
    public static void main(String[] args) {
//        stringFunction1();
//        stringFunction2();
    stringBuilder101();
        reverseString("AAYUSH");
    }

    private static void stringFunction1(){
        String firstName = "Tony";
        String firstName1 = "Tony";
        String lastName = "Stark";
        String fullName = firstName+" "+lastName;
        System.out.println("Hi my name is: "+fullName);
        System.out.println("Hi my name is: "+fullName.length());
        System.out.println("Character at index 5: "+fullName.charAt(5));
        if(firstName.compareTo(firstName1)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are NOT equal");
        }
    }
    private static void stringFunction2(){
    //Substring
        String name= "Tony Stark";
        //str1.substring(beg,end-1)
        System.out.println(name.substring(0,4));
    }

    private static void stringBuilder101(){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);

        sb.insert(1,'h');
        System.out.println(sb);

        sb.delete(0,2);
        System.out.println(sb);
        sb.append("on");
        System.out.println(sb);
    }
    private static void reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length()/2;i++){
            int front =i;
            int back = sb.length()-1-i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}

