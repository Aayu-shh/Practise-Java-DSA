package DSA;

import java.util.Optional;

public class LinkedList {
    public static void main(String[] args) {

        Node a = new Node(5);
        a.next = new Node(10);
        a.next.next = new Node(15);

        Node b = new Node(2);
        b.next = new Node(3);
        b.next.next = new Node(20);

        printList(a);
        printList(b);
        printList(sortedMerge(a,b));

        Optional<Integer> myOptional;
    }


    private static Node sortedMerge(Node a,Node b){
        Node dummy = new Node(0); //fake head
        Node tail = dummy;

        while(a!=null && b!=null){
            if(a.data>=b.data){
                tail.next = a;
                a=a.next;
            }
            else{
                tail.next=b;
                b=b.next;
            }
            tail = tail.next;
        }

        //If any remaining Nodes ??
        if(a!=null){
            tail.next=a;
        }
        if(b!=null){
            tail.next=b;
        }
        return dummy.next;
    }
    private static void printList(Node a){
        while(a!=null){
            System.out.print(a.data);
            if(a.next!=null){
                System.out.print("->");
            }
            a=a.next;
        }
        System.out.println();
    }
}

class Node{
    Node next;
    int data;

    Node(int data){
        this.data = data;
        this.next=null;
    }
}

