package Java8.codeDecode.Advanced;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"aayush", Arrays.asList("Pune","Mysore","Raipur"));
        Employee e2 = new Employee(4,"lakshmi", Arrays.asList("Mysore","Bangalore","Hubli"));
        Employee e3 = new Employee(2,"gungun", Arrays.asList("Raipur","Chennai","Delhi"));

        e1.setDepartment("IT");
        e2.setDepartment("IT");
        e3.setDepartment("HR");


        List<Employee> empList = Arrays.asList(e1,e2,e3);
        System.out.println(empList );
//
//        // W/O streams
//        List<Integer> ids = new ArrayList<>();
//        for(Employee e:empList){
//            ids.add(e.getId());
//        }
//        System.out.println(ids);
//
//        //With Streams 4 lines -> 2 lines
//        List<Integer> idsUsingStreams = empList.stream().map(Employee::getId).toList();
//        System.out.println(idsUsingStreams);
//
//        //flatMap --> Q. Find list of cities Employees working in
//        System.out.println(
//                empList.stream().map(e->e.getCitiesWorked()).collect(Collectors.toUnmodifiableList())
//        );  //Returns a list of lists --> need flattening so using flatMap -> map & then flatten
//
//
//        // Solution: Finding Unique set of cities my Employees work in
//        Set<String> setOfCities = empList.stream().flatMap(e->e.getCitiesWorked().stream()).collect(Collectors.toSet());
//        System.out.println(setOfCities);
//
//        //Q Sort List of Employees sorted based on salary
//        e1.setSalary(52000);
//        e2.setSalary(61000);
//        e3.setSalary(35000);
//        List<Employee> empListBasedOnSalary = empList.stream().sorted((Employee e11,Employee e22)->e22.getSalary().compareTo(e11.getSalary())).toList();
//        List<String> empNamesListBasedOnSalary = empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).map(Employee::getName).toList();
////        System.out.println(empListBasedOnSalary);  //Won't print salary as toString wasn't modified to show salary
////        System.out.println(empNamesListBasedOnSalary);
//        Employee lowestSalary = empList.stream().min(Comparator.comparing(Employee::getSalary)).get();
//        Employee highestSalary = empList.stream().max(Comparator.comparing(Employee::getSalary)).get();
////        System.out.println(lowestSalary.getName());
////        System.out.println(highestSalary.getName());
//
//
//        /* Summary Statistic (IntStream Needed) */
//
//       List<Integer> salaries =  empList.stream().map(Employee::getSalary).toList();
//        IntSummaryStatistics summaryStatistics =  salaries.stream().mapToInt(x->x).summaryStatistics();      //mapToInt to get IntStream to use .summaryStatistics( )
//        System.out.println("Salary Stastics: Min->"+ summaryStatistics.getMin()+" Max -> "+ summaryStatistics.getMax()+" Average -> "+ summaryStatistics.getAverage()+" Sum -> "+ summaryStatistics.getSum());
//
//        /* Slicing a Stream*/
//        List<Integer> salariesOrdered =  empList.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).toList();
//        List<Integer> secondThirdHighestSalary = salariesOrdered.stream().skip(1).limit(2).toList();
//        System.out.println("Here are the 2nd and Third Highest Salary: "+ secondThirdHighestSalary);
//
//        /* Getting list of names as string*/
//        String namesListAsString = empNamesListBasedOnSalary.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
//        System.out.println(namesListAsString);
//        System.out.println(String.join(" ", setOfCities));
//        //Or use String.join(", ",empNamesListBasedOnSalary);
//

        //groupingBy Dept
        Map<String,List<String>> myEmpByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName,toList())));
        System.out.println(myEmpByDept);

        List<Integer> randomNumbers = Arrays.asList(new Integer[]{1,1,2,5,7,3,2,1,5,9,5,1,9,0,6,4,7,3});
        Map<Integer,Long> myMap= randomNumbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(myMap);
        int maxKey = -1;
        int maxVal=-1;
//        List <Integer> myList = List.of();
        int [] myList = new int[]{1,2,3,4,5};
        for(int i = 0 ; i<myList.length;i++){
            for(int j=i+1;j<myList.length;j++){
                int tmp = myList[i];
                myList[i]=myList[j];
                myList[i+1]=tmp;
            }
        }
        for(int num:myList){
            System.out.println(num);
        }
    }
}
