package Multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPools {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService exec = Executors.newFixedThreadPool(2);
        ExecutorService exec1 = Executors.newSingleThreadExecutor();
        ExecutorService exec2 = Executors.newScheduledThreadPool(2);

        Future<Integer> f1= exec.submit(()->
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Executing task from: "+Thread.currentThread().getName());
            return 5;
        });
        System.out.println(f1.get());
        exec.submit(()-> System.out.println("Executing task from: "+Thread.currentThread().getName()));
        exec.submit(()-> System.out.println("Executing task from: "+Thread.currentThread().getName()));
//        exec.submit(()-> System.out.println("Executing task from: "+Thread.currentThread().getName()));
        exec.shutdown();
    }
}


