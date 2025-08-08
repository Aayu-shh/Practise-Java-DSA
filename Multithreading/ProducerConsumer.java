package Multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
//Problem:
//Implement producer-consumer using BlockingQueue.
public class ProducerConsumer {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        Runnable producer = () -> {
            try {
                for (int i = 0; i < 5; i++) {
                    queue.put(i);
                    System.out.println("Produced: " + i);
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        };

        Runnable consumer = () -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Consumed: " + queue.take());
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        };
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
//Problem:
//Implement producer-consumer using BlockingQueue.
//
// Solution:
// BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);


