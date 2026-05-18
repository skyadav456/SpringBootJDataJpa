package com.stream;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingConcept {
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

        // group emp by department

        Map<String, List<Employee>> empByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(empByDept);

        // department wise average salary

        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept
                        , Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalaryByDept);

        // department with total salary

        Map<String, Double> totalSalary = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept,
                        Collectors.summingDouble(Employee::getSalary)));
        System.out.println(totalSalary  );


    }
}
