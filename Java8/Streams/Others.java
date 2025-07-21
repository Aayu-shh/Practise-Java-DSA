package Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Others {
    public static void main(String[] args) {
        //Q list of Strings -> emails , find unique emailDomains
        // email -> @xyz.com
        List<String> emails = Arrays.asList("a@x.com","b@y.com","c@z.com","d@x.com");
        Set<String> myset = emails.stream().map(str->str.split("@")[1]).peek(System.out::println).collect(Collectors.toSet());
        System.out.println(myset.size());
        System.out.println(myset.stream().toList());

        //Using substring
        System.out.println(emails.stream()
                .map(email->email.substring(email.indexOf('@')+1))
                .distinct()
                .count());
        // [[a,x.com],..


        //Other
        Node<String,Integer> myNode = new Node<>("A",1);
        myNode.next=new Node<>("B",2);
        System.out.println(myNode.dataKey.hashCode());


        // Imp
//        System.out.println((char)10084); //Lakshmi

        //Q. Find number of Signed Bits / 1s in the Binary representation of an Integer eg 3=> 11 =>2
        String binary = Integer.toBinaryString(23);
        System.out.println(binary);
        long myCount = Arrays.stream(binary.split("")).filter(s-> s.equals("1")).count();
        System.out.println(myCount);
    }
}

//Other
class Node<K,V>{
    K dataKey;
    V dataValue;
    Node<K,V> next;

    public Node(K key,V value){
        this.dataKey=key;
        this.dataValue=value;
    }
}
