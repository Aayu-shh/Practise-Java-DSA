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

    public static void main(String[] args) {
        ListNode Node1 = new ListNode(1);
        Node1.next=new ListNode(2);
        Node1.next.next=new ListNode(3);
        Node1.next.next.next=new ListNode(4);
        Node1.next.next.next.next=Node1.next.next.next;
        System.out.println(hasCycle(Node1));

    }
}