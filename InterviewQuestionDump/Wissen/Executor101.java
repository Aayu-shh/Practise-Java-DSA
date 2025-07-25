package InterviewQuestionDump.Wissen;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executor101 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Executor (Framework) Interface -> abstraction on Thread, for Creating, Managing , reusing, shutting down threads effectively
        ExecutorService exec = Executors.newFixedThreadPool(2);
        Future<Integer> f1= exec.submit(()->{
            System.out.println("Inside Fixed thread pool executor 1");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName());
            return -1;
        });

        Future<Integer> f2= exec.submit(()->{
            System.out.println("Inside Fixed thread pool executor 2");
            Thread.sleep(5500);
            System.out.println(Thread.currentThread().getName());
            return -2;
        });

        System.out.println(f1.get());
//        System.out.println(f2.get());
        System.out.println("Main ");
        exec.shutdown();
    }
}
