package InterviewQuestionDump.Wissen;

public class Singleton {
    private static volatile Singleton singletonInstance;

    private Singleton(){
        System.out.println("Instance Created");
    }

    public static Singleton getSingletonInstance(){
        //First No lock checkning
        if(singletonInstance==null){
            synchronized (Singleton.class){
                //Double checking with Lock
                if(singletonInstance==null){
                    singletonInstance = new Singleton();
                }
            }
        }
        return singletonInstance;
    }

    public static void main(String[] args) {
        //Testing Double check locking
        for (int i = 0;i<5;i++){
            new Thread(()->{
                Singleton mySingletonObj = Singleton.getSingletonInstance();
                System.out.println(Thread.currentThread().getName()+" Instance of Singleton - "+mySingletonObj);
            }).start();
        }
    }
}
