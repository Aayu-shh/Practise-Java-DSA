//package Multithreading.ThreadWaitSleep;
//
//import java.util.concurrent.atomic.AtomicInteger;
//
//public class Wait {
//    public static void main(String[] args) {
//        AtomicInteger i= new AtomicInteger(0);
//        Thread worker1 = new Thread(()->{
//            System.out.println("i value 1:"+i);
//            while(i.get() <5){
//                System.out.println("Incrementing by 1:"+i.incrementAndGet(););
//            }
//        },"worker1");
//        Thread worker2 = new Thread(()->{
//            System.out.println("i value 2:"+i);
//            while(i.get() <500){
//                i.getAndIncrement();
//                try {
//                    Thread.sleep(1500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println("Incrementing by 2:"+i);
//            }
//        },"worker2");
//        Thread worker3 = new Thread(()->{
//
//        },"worker3");
//    }
//}
