import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Java8_EmployeePractise {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Damien", "Erin");
        Iterator<String> it = names.iterator();
        int count = 0;
        while(it.hasNext()){
            System.out.println("name"+ ++count+": "+ it.next());
        }
        names.stream()
                .filter(x -> x.contains("am"))
                .forEach(System.out::println);

    }
}

abstract class Person
{
    public abstract String getName();
}

class Employee extends Person
{
    private String name;

    public Employee(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public static void main (String[] args)
    {
        Employee employee = new Employee("John Wilson");

        System.out.println("Employee's Name "+ employee.getName());

        Person person = new Employee("Thomas Smith");

        System.out.println("Employee-Person's Name "+ person.getName());


    }
}
