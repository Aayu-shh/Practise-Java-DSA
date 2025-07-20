package Java8.Streams;

import Java8.codeDecode.Advanced.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeClassPractise {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Aayush", Arrays.asList("C1","C2","C3"),34000);
        Employee employee2 = new Employee(2,"Paresh",Arrays.asList("C3","C4","C5"),75000);
        Employee employee3 = new Employee(2,"Lakshmi",Arrays.asList("C3","C2"),30000);
        List<Employee> employeeList = List.of(employee1,employee2,employee3);

        List<String> names = employeeList.stream().map(Employee::getName).toList();

        //Q1. Cities ppl have worked in
        List<String> citiesWorked = employeeList.stream().flatMap(e->e.getCitiesWorked().stream()).distinct().toList();
        System.out.println(citiesWorked);

        //Q2. Group ppl by common cities C3:["aayush,"paresh","lakshmi"]
      Map<String, List<String>> employeesByCity=  employeeList.stream().flatMap(emp->emp.getCitiesWorked().stream().map(
                city-> new Object(){
                    public String cityName= city;
                    public String name = emp.getName();;
                    public String toString(){
                        return "City : "+cityName+" | Employee Name: "+name;
                    }
                }
        )).peek(System.out::println).collect(Collectors.groupingBy(
                obj->obj.cityName,
              Collectors.mapping(obj->obj.name,Collectors.toList())));

        System.out.println(employeesByCity);
    }
}
