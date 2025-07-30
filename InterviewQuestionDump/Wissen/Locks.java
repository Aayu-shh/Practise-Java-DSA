package InterviewQuestionDump.Wissen;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks {
    private static int counter = 0;
    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newFixedThreadPool(3);

        Runnable task = () ->{

          for(int i=0;i<1000;i++){
              lock.lock();
              try {
                  counter++;
              }
              finally {
                  lock.unlock();
              }
          }
        };

        exec.submit(task);
        exec.submit(task);
        exec.submit(task);
        exec.shutdown();
//        exec.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Final Counter value: "+counter);

    }
}
