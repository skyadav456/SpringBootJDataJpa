package com.sharad.testing.service;

import com.sharad.testing.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public boolean saveCustomer(Customer customer) {
        // logic to save customer to database
        return true;
    }
}
