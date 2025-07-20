package Multithreading;

public class ThreadMethods {
    public static void main(String[] args) throws InterruptedException {
        BasicThread t = new BasicThread("Basic Thread 1");

//        System.out.println("Thread id is "+t.getId());


        ThreadClass t1 = new ThreadClass("My name is Aayush");
        ThreadClass t2 = new ThreadClass("My name is Aayush2");
        ThreadClass t3 = new ThreadClass("My name is Aayush3");
        ThreadClass t4 = new ThreadClass("My name is Aayush4");
//        t.setPriority(Thread.MIN_PRIORITY);
//        t1.setPriority(7);
//        t2.setPriority(6);
//        t3.setPriority(10);
//        t4.setPriority(Thread.MAX_PRIORITY);
//        t.start();
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();

        /// Making thread 2 wait for thread 1 to finish
        BasicThread t11 = new BasicThread("Thread 1");
        ThreadClass t22 = new ThreadClass("Thread 2");
        t11.start();
       t11.join();
//        t22.start();
      t22.start();

//Problem:
// Create a thread that prints numbers from 1 to 5 with a delay of 1 second
      Thread tx = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        tx.start();
    }
}

class BasicThread extends Thread{
    public BasicThread(String name){
        super(name);
    }

    public void run(){
        int i = 35;
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        while (true){
            System.out.println("I am thread");
            i--;
            if(i==0){
                break;
            }
        }
    }
}

class ThreadClass extends Thread{
    private final String name;
    public ThreadClass(String name){
        super(name);
        this.name=name;
    }

    @Override
    public void run(){
        int i =21;

        while(i>0) {
            System.out.println("My Thread " + name);
            i--;
        }
        }
}

