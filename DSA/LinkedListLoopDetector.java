package DSA;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListLoopDetector {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // No cycle possible with 0 or 1 node
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Loop detected
            }
        }
        return false; // No loop found
    }

    private static boolean hasLoop(Node head){
        while(head!=null&&head.next!=null){
            Node fast = head.next.next;
            Node slow = head.next;
            if(fast==slow) return true;
            else head=head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode Node1 = new ListNode(1);
        Node1.next=new ListNode(2);
        Node1.next.next=new ListNode(3);
        Node1.next.next.next=new ListNode(4);
        Node1.next.next.next.next=Node1.next.next.next;
        System.out.println(hasCycle(Node1));

//        System.out.println(hasLoop(Node1));

        Node noLoopNode = new Node(1);
        noLoopNode.next = new Node(3);
        noLoopNode.next.next = new Node(5);
        noLoopNode.next.next.next = new Node(8);
        printLinkedList(noLoopNode);

        Node loopNode = new Node(1);
        loopNode.next=new Node(2);
        loopNode.next.next=new Node(3);
        loopNode.next.next.next=new Node(4);
        loopNode.next.next.next.next=loopNode.next.next.next;

        System.out.println(hasLoop(noLoopNode));
        System.out.println(hasLoop(loopNode));
    }

    public static void printLinkedList(Node head){
        Node myHead = head;
        while(myHead!=null) {
            System.out.print(myHead.data);
            if (null != myHead.next)  System.out.print( "->");
            myHead = myHead.next;
        }
        System.out.println();
    }
}