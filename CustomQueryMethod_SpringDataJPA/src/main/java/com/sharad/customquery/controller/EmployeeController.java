package com.sharad.customquery.controller;

import com.sharad.customquery.entity.Employee;
import com.sharad.customquery.service.EmpService;
import com.sharad.customquery.service.EmplServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmpService empService;

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        return new ResponseEntity<>(empService.getAllEmployees(), HttpStatus.OK);
    }

    @GetMapping("/department/{dept}")
    public ResponseEntity<List<Employee>> searchByDepartment(@PathVariable String dept){
        return new ResponseEntity<>(empService.getByDepartment(dept), HttpStatus.OK);

    }
    @GetMapping("/salary/{salary}")
    public ResponseEntity<List<Employee>> getBySalary(@PathVariable double salary){
        return new ResponseEntity<>(empService.getBySalary(String.valueOf(salary)), HttpStatus.OK);
    }
    @GetMapping("/search/{name}")
    public ResponseEntity<List<Employee>> searchByName(@PathVariable String name){
        return new ResponseEntity<>(empService.getByName(name), HttpStatus.OK);
    }
}
