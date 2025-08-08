package Multithreading.ThreadWaitSleep;

public class Producer extends Thread{

    private final SharedBuffer sharedBuffer;
    //Constructor injection
    public Producer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    public void run(){
        int i=1; // to generate natural numbers and add to buffer
        try {
            while (true){
                sharedBuffer.produce(i++);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
