package com.sharad.testing.controller;

import com.sharad.testing.model.Customer;
import com.sharad.testing.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @PostMapping("/customers")
    public ResponseEntity<String> saveCustomer(@RequestBody Customer customer) {
        boolean isSaved = customerService.saveCustomer(customer);
        if (isSaved) {
            return new ResponseEntity<>("Customer saved successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Customer could not be saved", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
