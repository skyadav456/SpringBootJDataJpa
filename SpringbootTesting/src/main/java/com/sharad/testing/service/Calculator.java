package com.sharad.testing.service;

import org.springframework.stereotype.Service;

@Service
public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public boolean isEven(int number){
        return number % 2 == 0;
    }
}
