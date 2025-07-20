package Java8.codeDecode;

public class InterfaceDemoImpl2 implements InterfaceDemo{
    @Override
     public void printName(){
        System.out.println("Implemented printName method in class: "+getClass());
    }
    void printHomeName(){
        System.out.println("Hello");
    }
}
class InterfaceDemoImplChild extends InterfaceDemoImpl2{
    @Override
    public void printHomeName(){
        System.out.println("HelloChild");
    }
    @Override
    public void printName(){
        System.out.println("Implemented printName method in class: "+getClass());
    }

    public static void main(String[] args) {
        InterfaceDemoImpl2 idlChild2 = new InterfaceDemoImplChild();
        idlChild2.printHomeName();
        idlChild2.printHomeName();
        InterfaceDemoImpl2 idl2 = new InterfaceDemoImpl2();
        idl2.printName();
        idlChild2.printName();

    }
}
