package com.sharad.customquery.service;

import com.sharad.customquery.entity.Employee;
import com.sharad.customquery.repository.EmployeeRepository;

import java.util.List;

public interface EmpService {

    public List<Employee> getAllEmployees();
    public List<Employee> getByDepartment(String department);
    public List<Employee> getBySalary(String salary);
    public List<Employee> getByName(String name);

}
