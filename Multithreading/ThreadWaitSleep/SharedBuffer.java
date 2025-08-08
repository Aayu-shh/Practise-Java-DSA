package Multithreading.ThreadWaitSleep;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity = 5;

    public synchronized void produce(int item) throws InterruptedException{
        while(queue.size()==capacity){
            System.out.println("Buffer full. Producer waiting..");
            wait(); //wait for consumer notify() after consuming
        }
        queue.add(item);
        System.out.println("Produced: "+item);
        notify();
    }

    public synchronized int consume() throws InterruptedException {
        while(queue.isEmpty()){
            System.out.println("Buffer Empty. Consumer Waiting..");
            wait(); //Wait for producer thread to notify() AFTER producing
        }
        int item = queue.poll();
        System.out.println("Consumed Item: "+ item);
        notify();
        return item;
    }
}
