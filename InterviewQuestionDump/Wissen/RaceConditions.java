package InterviewQuestionDump.Wissen;

public class RaceConditions {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(()->{
            for(int i = 0;i<1000;i++) counter.increment();
        });
        Thread t2 = new Thread(()->{
            for(int i = 0;i<1000;i++) counter.increment();
        });

        t1.start();
        t2.start();
        t1.join(); // To Ensure Control goes to main POST execution completion of t1
        t2.join(); // and of t2
        System.out.println("In the Thread: " + Thread.currentThread().getName());  //Main thread
        System.out.println("Expected 2000, Actual is : "+counter.counter); // Fixed using synchronized over .increment() method
    }
}

class Counter{
    int counter=0;
    synchronized void increment(){
        counter++;
    }
}
