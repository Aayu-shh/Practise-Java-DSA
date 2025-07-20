package Java8.codeDecode;

public interface InterfaceDemo {
    void printName();
     default void printName1(){
        System.out.println("My default method printName");
    }
}
