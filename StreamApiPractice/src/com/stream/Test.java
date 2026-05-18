package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101, "Sharad", "IT", 75000, 26, "Pune"),
                new Employee(102, "Amit", "HR", 55000, 29, "Delhi"),
                new Employee(103, "Neha", "IT", 90000, 28, "Bangalore"),
                new Employee(104, "Rahul", "Finance", 65000, 32, "Mumbai"),
                new Employee(105, "Priya", "HR", 60000, 25, "Pune"),
                new Employee(106, "Karan", "IT", 50000, 24, "Delhi"),
                new Employee(107, "Riya", "Finance", 80000, 30, "Bangalore"),
                new Employee(108, "Vikas", "Sales", 45000, 27, "Mumbai")
        );

       // emp having sal>60000

       List<Employee> result=employees.stream()
               .filter(emp->emp.getSalary()>6000)
               .collect(Collectors.toList());

        System.out.println(result);

       // Get only employee names
       List<String> names= employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(names);

       //Count employees in IT department
      long count= employees.stream()
               .filter(e->e.getDept().equals("IT"))
               .count();
        System.out.println(count);

      // Sort employees by salary (Ascending)

     List<Employee> sortedBySalary= employees.stream()
              .sorted(Comparator.comparing(Employee::getSalary))
              .collect(Collectors.toList());
     System.out.println(sortedBySalary);

    //Sort by salary (Descending)

    List<Employee> desSorting=employees.stream()
            .sorted(Comparator.comparing(Employee::getSalary).reversed())
            .collect(Collectors.toList());
        System.out.println(desSorting);


    // Highest salary employee
    Employee maxSalaryEmp=employees.stream()
            .max(Comparator.comparing(Employee::getSalary))
            .get();
        System.out.println(maxSalaryEmp);

    // Lowest salary employee

    Employee minSalEmp=employees.stream()
            .min(Comparator.comparing(Employee::getSalary))
            .get();
        System.out.println(minSalEmp);

        // sort emp by age

        List<String> sortedByAge=employees.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .map(employee -> employee.getName())
                .collect(Collectors.toList());
        System.out.println(sortedByAge);












    }




}
