package Java8.codeDecode.Advanced;

import java.util.List;

public class Employee {
    private Integer id;
    private String name;
    private List<String> citiesWorked;
    private String department;
    private Integer salary;
    public Employee(Integer id, String name, List<String> citiesWorked ) {
        super();
        this.id = id;
        this.name = name;
        this.citiesWorked = citiesWorked;
    }
//    public Employee(Integer id, String name, List<String> citiesWorked, String department) {
//        super();
//        this.id = id;
//        this.name = name;
//        this.citiesWorked = citiesWorked;
//        this.department = department;
//    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getCitiesWorked(){
        return this.citiesWorked;
    }

    public String toString() {
        return String.format("id: %d | Name: %s | CitiesWorked: %s", this.id, this.name, this.citiesWorked);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
