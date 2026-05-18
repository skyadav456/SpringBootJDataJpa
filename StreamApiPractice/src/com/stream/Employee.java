package com.stream;

class Employee {
    private int id;
    private String name;
    private String dept;
    private double salary;
    private int age;
    private String city;

    public Employee(int id, String name, String dept, double salary, int age, String city) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.age = age;
        this.city = city;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDept() { return dept; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
    public String getCity() { return city; }

    @Override
    public String toString() {
        return id + " " + name + " " + dept + " " + salary + " " + age + " " + city;
    }
}

