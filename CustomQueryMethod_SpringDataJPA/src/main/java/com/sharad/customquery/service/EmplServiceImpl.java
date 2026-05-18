package com.sharad.customquery.service;

import com.sharad.customquery.entity.Employee;
import com.sharad.customquery.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmplServiceImpl implements EmpService{

    @Autowired
    private EmployeeRepository empRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return empRepository.getAllEmployees();
    }

    @Override
    public List<Employee> getByDepartment(String department) {
        return empRepository.getByDepartment(department);
    }

    @Override
    public List<Employee> getBySalary(String salary) {
        return empRepository.getBySalary(Double.valueOf(salary));
    }

    @Override
    public List<Employee> getByName(String name) {
        return empRepository.searchByName(name);
    }
}
