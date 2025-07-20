package Java8.codeDecode;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsAdvanced {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Aayush", 26, 30000);
        Employee e2 = new Employee(2, "Lakshmi", 24, 50000);
        Employee e3 = new Employee(3, "Jawahar", 24, 38000);
        Employee e4 = new Employee(4, "Renuka", 26, 25000);

        /*
        * Imp!! Demonstrate that Intermediate Operations are LAZY (aren;t called until terminal is called
        * */

//        Stream.of(e1, e2, e3, e4)
//                .filter(employee -> employee.getSalary() >= 30000)
//                .map(employee -> {
//                    System.out.println("From object " + employee.getName());
//                    return employee.getName(); //mapping employee object in stream to its name only
//                }).forEach(System.out::println);  //-->Won't print until terminal operation forEach is called

//        System.out.println(s.toList());       //Or like toList() That is .collect(Collectors.toList())

    /*
     * Return list of employees with descending order of salaries | add .limit(n) for highest 'n' salaries | add .skip(n-1) for getting 'n'th highest salary on get(1)
     */
        List<Employee> empList = Arrays.asList(e1, e2, e3, e4);
//        System.out.println(empList.stream()
//                .sorted(Comparator.comparingInt(Employee::getSalary).reversed()).peek(System.out::println)
//                .map(Employee::getName).toList());

//        System.out.println("Total Salary: " + empList.stream().map(Employee::getSalary).reduce((a, b) -> a + b).get());

        /* ShortCircuit Ops
         *
         * 1. Intermediate Ops: limit(long N)
         * 2. Terminal Ops: findFirst(),findAny()
         *  */
//        System.out.println(empList.stream()
//                .peek(employee -> employee.setSalary(employee.getSalary() * 2))
//                .limit(2)           //Limit employee stream to 2 size
//                .sorted(Comparator.comparingInt(Employee::getAge).reversed())   //Sort based on Age
//                .collect(Collectors.toList()));

        //Doubling employee salary the right way , inside the Stream only
        System.out.println(empList.stream()
                .map(employee -> new Employee(employee.getid(),employee.getName(),employee.getAge(),employee.getSalary()*2))
                .limit(3)           //Limit employee stream to 2 size
                .sorted(Comparator.comparingInt(Employee::getAge).reversed())   //Sort based on Age
                .allMatch(employee -> employee.getName().contains("sh")));

    }
}

class Employee {
    private Integer id;
    private String name;
    private Integer age;
    private Integer salary;

    public Employee(Integer id, String name, Integer age, Integer salary) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public Integer getid() {
        return this.id;
    }
    public Integer getSalary() {
        return this.salary;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return String.format("Name: %s | Age: %d | Salary: %d", this.name, this.age, this.salary);
    }
}
