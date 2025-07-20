package Java8;

public class FunctionaInterfaces1 {
    public static void main(String [] args){
        // Using an anonymous inner class (pre Java 8 Way)
        //Runnable is a FunctionalInterface with Abstract method 'run()' which is implemented using anonymous inner class below
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New Thread Created");
            }
        }).start();

        // Using a lambda (Java 8+)
        Runnable runnableLambda = () -> System.out.println("New Thread created with Lamda!");   //Implementing Abstract Method run() implicitly
        new Thread(() -> System.out.println("New Thread created with Lamda!")).start();
        new Thread(runnableLambda).start();
    }
}

