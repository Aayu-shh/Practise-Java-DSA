package Multithreading.ThreadWaitSleep;

public class Consumer extends Thread{

    private final SharedBuffer sharedBuffer;

    public Consumer(SharedBuffer sharedBuffer){
        this.sharedBuffer = sharedBuffer;
    }

    public void run(){
        try {
            while (true) {
                sharedBuffer.consume();
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

}
