package Java8;

class Box<T>{
    private T value;

    public void set(T value){
        this.value = value;
    }
    public T get(){
        return this.value;
    }
}
public class Generics {

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(21);
        System.out.println(intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Boxing-1");
        System.out.println(strBox.get());
    }
}