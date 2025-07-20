package Multithreading;

public class ThreadBasics {
    public static void main(String[] args) {
        Thread1 myThread1 = new Thread1("myThreadName1");
        Thread2 myThread2 = new Thread2();
        myThread1.start();
        System.out.printf("Thread1 Name = %s Thread 1 id = %d\n", myThread1.getName(), myThread1.threadId());
        System.out.printf("Thread2 Name = %s Thread 2 id = %s\n", myThread2.getName(), myThread2.threadId());
        myThread2.start();


        //Using Java8 for Runnable interface
        Runnable myRunnable = () -> {
            int i = 0;
            while (i < 11) {
                System.out.println("Inside Runnable interface");
                i++;
            }
        };
        Thread myThread3 = new Thread(myRunnable, "myThreadRunnable");
        myThread3.start();
        System.out.printf("Thread3 Name = %s Thread 3 id = %s\n", myThread3.getName(), myThread3.threadId());


    }
}

/*
 * Methods of creating thread:
 * 1. EXTENDS thread class
 * 2. IMPLEMENT Runnable Interface and pass the object of class to Thread constructor
 */

class Thread1 extends Thread {
    @Override
    public void run() {
        int i = 40;
        while (i > 0) {
            System.out.println("My thread1 is running");
            i--;
        }
    }

    public Thread1(String name) {
        super(name);
    }
}

class Thread2 extends Thread {
    public void run() {
        int i = 10;
        while (i > 0) {
            System.out.println("Aaarey Thread 2 is runinng 000");
            i--;
        }
    }
}