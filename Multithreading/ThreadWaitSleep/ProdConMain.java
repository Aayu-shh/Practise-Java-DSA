package Multithreading.ThreadWaitSleep;

public class ProdConMain {
    public static void main(String[] args) {
        SharedBuffer sharedBuffer = new SharedBuffer();
        Producer producer = new Producer(sharedBuffer);
        Consumer consumer = new Consumer(sharedBuffer);

        producer.start();
        consumer.start();
    }
}
/*
The Code will simulate a sharedBuffer using wait()-notify() and sleep() methods
 */