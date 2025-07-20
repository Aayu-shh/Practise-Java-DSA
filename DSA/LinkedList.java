package DSA;

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
//        printList(sortedMerge(a,b));
        printList(sortedMerge2(a,b));

    }


//    private static Node sortedMerge(Node a,Node b){
//        Node dummy = new Node(0); //fake head
//        Node tail = dummy;
//
//        while(a!=null && b!=null){
//            if(a.data>=b.data){
//                tail.next = b;
//                b=b.next;
//            }
//            else{
//                tail.next=a;
//                a=a.next;
//            }
//            tail = tail.next;
//        }
//
//        //If any remaining Nodes ??
//        if(a!=null){
//            tail.next=a;
//        }
//        if(b!=null){
//            tail.next=b;
//        }
//        return dummy.next;
//    }


    /*
    * sortedMerge2 takes 2 Head Nodes of Sorted Linked List in Ascending order
    *  SortedMerge them into one Linked List and @Return "head" of SortedMerged LinkedList
     */
    private static Node sortedMerge2(Node a,Node b){
        Node head = new Node(0);
        Node pointer = head;
        while(null != a && null != b){
            if(a.data>b.data)
            {
                pointer.next=b;
                b=b.next;
            }
            else {
                pointer.next=a;
                a=a.next;
            }
            pointer=pointer.next;
        }
        //Adding the remaining List (only one will remain as either a OR b will become null to break WHILE loop)
        if(a!=null) pointer.next=a;
        else pointer.next=b;
        return head.next;
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

