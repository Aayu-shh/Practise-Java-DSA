package Java8.codeDecode;

public class InterfaceDemoImpl1 implements InterfaceDemo{
    @Override
    public void printName(){
        System.out.println("Implemented printName method in class: "+getClass());
    }

//    @Override
//    //Needed to increase the access specifier to PUBLIC
//    public void printName1(){
//        System.out.println("My OVERRIDEN default method printName");
//    }

    public static void main(String[] args) {
        new InterfaceDemoImpl1().printName();
        new InterfaceDemoImpl1().printName1();
    }

}
