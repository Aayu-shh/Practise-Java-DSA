package InterviewQuestionDump.Wissen;

public class MultiThreading101 {
    public static void main(String[] args) throws InterruptedException {

        //Using Runnable
        Runnable r1 = ()-> System.out.println("I am thread 1");
        Thread t1 = new Thread(r1,"Thread 1");

        //Extending Thread Class
        Thread t2 = new MyThread("Thread 2");


        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        t2.start();
    }
}
class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println(System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("I am thread 2");
        //To check difference between Current and Waited k baad ka Time
        System.out.println(System.currentTimeMillis());
    }
    public MyThread(String name){
        this.setName(name);
    }
    public MyThread(){
    }
}