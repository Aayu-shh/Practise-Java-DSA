package Java8.codeDecode;

public class InterfaceWithStaticMethodsImpl implements InterfaceWithStaticMethods,InterfaceDemo{
    public static void main(String[] args) {
        InterfaceWithStaticMethods i = new InterfaceWithStaticMethodsImpl();
        InterfaceWithStaticMethods.myStaticMethod();
        InterfaceWithStaticMethodsImpl.myStaticMethod();

    }
//    @Override
    public static void myStaticMethod(){
        System.out.println("Overrriden");
    }

    @Override
    public void printName() {

    }

    @Override
    public void printName1() {
        InterfaceDemo.super.printName1();
    }
}
