package InterviewQuestionDump.Wissen;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(StringPractise[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Queue<Integer> deque = new ArrayDeque<>();

        linkedList.offer(1);  // Works fine
        deque.offer(1);  // Works fine

        linkedList.offer(2);
        linkedList.offer(3);
        linkedList.offer(4);
        linkedList.offerFirst(5);
        linkedList.pollLast();

        System.out.println(linkedList);
        linkedList.add(2,22);
        System.out.println(linkedList);



    }
}
